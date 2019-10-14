package cn.qs.controller.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.finance.Agree;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.finance.AgreeService;

@Controller
@RequestMapping("agree")
public class AgreeController extends AbstractController<Agree, Integer> {

	@Autowired
	private AgreeService agreeService;

	@Override
	public String getViewBasePath() {
		return "agree";
	}

	@Override
	public BaseService getBaseService() {
		return agreeService;
	}

}
