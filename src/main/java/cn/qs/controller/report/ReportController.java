package cn.qs.controller.report;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.baseinfo.FarmService;
import cn.qs.service.report.ReportService;
import cn.qs.utils.DefaultValue;

@Controller
@RequestMapping("report")
public class ReportController extends AbstractController {

	@Autowired
	private ReportService reportService;

	@Autowired
	private FarmService farmService;

	@RequestMapping("/report1")
	public String report1() {
		return getViewPath("report1");
	}

	@RequestMapping("/report2")
	public String report2() {
		return getViewPath("report2");
	}

	@RequestMapping("/report3")
	public String report3() {
		return getViewPath("report3");
	}

	@RequestMapping("/report4")
	public String report4() {
		return getViewPath("report4");
	}

	@RequestMapping("/report5")
	public String report5() {
		return getViewPath("report5");
	}

	@RequestMapping("/report6")
	public String report6() {
		return getViewPath("report6");
	}

	@RequestMapping("/report7")
	public String report7() {
		return getViewPath("report7");
	}

	@RequestMapping("/report1Data")
	@ResponseBody
	public Map<String, Object> report1Data() {
		Map<String, Object> result = new HashMap<String, Object>();

		List<Map<String, Object>> report1 = reportService.report1(null);
		List<String> xXis = new ArrayList<>();
		List<Integer> yXis = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(report1)) {
			for (Map<String, Object> tmpMap : report1) {
				String name = MapUtils.getString(tmpMap, "name", "");
				Integer remark2 = MapUtils.getInteger(tmpMap, "remark2", 0);

				xXis.add(name);
				yXis.add(remark2);
			}
		}

		result.put("XAxis", xXis);
		result.put("YAxis", yXis);

		return result;
	}

	@RequestMapping("/report2Data")
	@ResponseBody
	public List<Map<String, Object>> report2Data() {
		List<Map<String, Object>> result = new ArrayList<>();

		List<Map<String, Object>> report1 = reportService.report1(null);
		if (CollectionUtils.isNotEmpty(report1)) {
			for (Map<String, Object> tmpMap : report1) {
				Map<String, Object> tMap = new HashMap<>();

				String name = MapUtils.getString(tmpMap, "name", "");
				Integer remark2 = MapUtils.getInteger(tmpMap, "remark2", 0);

				tMap.put("name", name);
				tMap.put("value", remark2);
				result.add(tMap);
			}
		}

		return result;
	}

	@RequestMapping("/report3Data")
	@ResponseBody
	public List<Map<String, Object>> report3Data() {
		List<Map<String, Object>> result = new ArrayList<>();

		List<Map<String, Object>> report1 = reportService.report1(null);
		if (CollectionUtils.isNotEmpty(report1)) {
			for (Map<String, Object> tmpMap : report1) {
				Map<String, Object> tMap = new HashMap<>();

				String name = MapUtils.getString(tmpMap, "name", "");
				Integer remark3 = MapUtils.getInteger(tmpMap, "remark3", 0);

				tMap.put("name", name);
				tMap.put("value", remark3);
				result.add(tMap);
			}
		}

		return result;
	}

	@RequestMapping("report4Data")
	@ResponseBody
	public PageInfo<Map<String, Object>> report4Data(@RequestParam Map condition) {
		int pageNum = 1;
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = MapUtils.getInteger(condition, "pageNum");
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = MapUtils.getInteger(condition, "pageSize");
		}

		// 开始分页
		PageHelper.startPage(pageNum, pageSize, " remark2+0 desc ");
		List<Map<String, Object>> users = new ArrayList<Map<String, Object>>();
		try {
			users = reportService.report1(null);
		} catch (Exception ignore) {
			// ignore
		}
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(users);

		return pageInfo;
	}

	@RequestMapping("report5Data")
	@ResponseBody
	public PageInfo<Map<String, Object>> report5Data(@RequestParam Map condition) {
		int pageNum = 1;
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = MapUtils.getInteger(condition, "pageNum");
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = MapUtils.getInteger(condition, "pageSize");
		}

		// 开始分页
		PageHelper.startPage(pageNum, pageSize, " remark3+0 desc ");
		List<Map<String, Object>> users = new ArrayList<Map<String, Object>>();
		try {
			users = reportService.report1(null);
		} catch (Exception ignore) {
			// ignore
		}
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(users);

		return pageInfo;
	}

	@RequestMapping("report6Data")
	@ResponseBody
	public PageInfo<Map<String, Object>> report6Data(@RequestParam Map condition) {
		int pageNum = 1;
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = MapUtils.getInteger(condition, "pageNum");
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = MapUtils.getInteger(condition, "pageSize");
		}

		// 开始分页
		PageHelper.startPage(pageNum, pageSize, " remark12+0 desc ");
		List<Map<String, Object>> users = new ArrayList<Map<String, Object>>();
		try {
			users = reportService.report1(null);
		} catch (Exception ignore) {
			// ignore
		}
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(users);

		return pageInfo;
	}

	@RequestMapping("report7Data")
	@ResponseBody
	public PageInfo<Map<String, Object>> report7Data(@RequestParam Map condition) {
		int pageNum = 1;
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = MapUtils.getInteger(condition, "pageNum");
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = MapUtils.getInteger(condition, "pageSize");
		}

		// 开始分页
		PageHelper.startPage(pageNum, pageSize, " remark13+0 desc ");
		List<Map<String, Object>> users = new ArrayList<Map<String, Object>>();
		try {
			users = reportService.report1(null);
		} catch (Exception ignore) {
			// ignore
		}
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(users);

		return pageInfo;
	}

	@Override
	public String getViewBasePath() {
		return "report";
	}

	@Override
	public BaseService getBaseService() {
		return null;
	}

}
