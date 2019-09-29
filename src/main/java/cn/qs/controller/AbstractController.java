package cn.qs.controller;

import java.io.Serializable;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qs.service.BaseService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.file.PropertiesFileUtils;

/**
 * 所以控制层的基类
 * 
 * @author Administrator
 *
 */
public abstract class AbstractController<T, E extends Serializable> {

	protected String productName = StringUtils
			.defaultIfBlank(PropertiesFileUtils.getPropertyValue("settings.properties", "productName"), "管理网");

	/**
	 * 页面所在的目录
	 * 
	 * @return
	 */
	public abstract String getViewBasePath();

	public abstract BaseService<T, E> getBaseService();

	/**
	 * 生成带basePath的页面路径
	 * 
	 * @param path
	 * @return
	 */
	public String getViewPath(String path) {
		return getViewBasePath() + "/" + path;
	}

	@RequestMapping("add")
	public String add() {
		return getViewPath("add");
	}

	@RequestMapping("doAdd")
	@ResponseBody
	public JSONResultUtil doAdd(T bean, HttpServletRequest request) {
		getBaseService().add(bean);
		return JSONResultUtil.ok();
	}

	@RequestMapping("list")
	public String list() {
		return getViewPath("list");
	}

	@RequestMapping("page")
	@ResponseBody
	public Page<T> page(@RequestParam Map condition, HttpServletRequest request) {
		int pageNum = 1;
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = MapUtils.getInteger(condition, "pageNum");
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = MapUtils.getInteger(condition, "pageSize");
		}

		condition.put("pageNum", pageNum - 1);
		condition.put("pageSize", pageSize);

		Page<T> pages = null;
		// 开始分页
		try {
			pages = getBaseService().pageByCondition(condition);
		} catch (Exception e) {
		}

		return pages;
	}

	@RequestMapping("delete")
	@ResponseBody
	public JSONResultUtil delete(E id) {
		getBaseService().delete(id);
		return JSONResultUtil.ok();
	}

	@RequestMapping("update")
	public String update(E id, ModelMap map, HttpServletRequest request) {
		T bean = getBaseService().findById(id);
		map.addAttribute("bean", bean);
		return getViewPath("update");
	}

	@RequestMapping("doUpdate")
	@ResponseBody
	public JSONResultUtil doUpdate(T bean) {
		getBaseService().update(bean);
		return JSONResultUtil.ok();
	}

}
