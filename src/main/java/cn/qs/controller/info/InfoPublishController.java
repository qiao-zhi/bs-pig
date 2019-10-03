package cn.qs.controller.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.info.InfoPublish;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.info.InfoPublishService;

/**
 * 每日推送
 */
@Controller
@RequestMapping("infoPublish")
public class InfoPublishController extends AbstractController<InfoPublish, Integer> {

	@Autowired
	private InfoPublishService infoPublishService;

	@Override
	public String getViewBasePath() {
		return "infoPublish";
	}

	@Override
	public BaseService<InfoPublish, Integer> getBaseService() {
		return infoPublishService;
	}

}
