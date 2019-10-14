package cn.qs.controller.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.finance.Charge;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.finance.ChargeService;

@Controller
@RequestMapping("charge")
public class ChargeController extends AbstractController<Charge, Integer> {

	@Autowired
	private ChargeService chargeService;

	@Override
	public String getViewBasePath() {
		return "charge";
	}

	@Override
	public BaseService getBaseService() {
		return chargeService;
	}

}
