package cn.qs.controller.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.info.DailyPush;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.info.DailyPushService;

/**
 * 每日推送
 */
@Controller
@RequestMapping("dailypush")
public class DailyPushController extends AbstractController<DailyPush, Integer> {

	@Autowired
	private DailyPushService dailyPushService;

	@Override
	public String getViewBasePath() {
		return "dailypush";
	}

	@Override
	public BaseService<DailyPush, Integer> getBaseService() {
		return dailyPushService;
	}

}
