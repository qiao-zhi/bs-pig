package cn.qs.controller.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.info.DailyRemind;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.info.DailyRemindService;

/**
 * 每日推送
 */
@Controller
@RequestMapping("dailyRemind")
public class DailyRemindController extends AbstractController<DailyRemind, Integer> {

	@Autowired
	private DailyRemindService dailyRemindService;

	@Override
	public String getViewBasePath() {
		return "dailyRemind";
	}

	@Override
	public BaseService<DailyRemind, Integer> getBaseService() {
		return dailyRemindService;
	}

}
