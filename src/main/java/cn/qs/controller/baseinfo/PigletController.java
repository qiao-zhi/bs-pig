package cn.qs.controller.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.baseinfo.Piglet;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.baseinfo.PigletService;

@Controller
@RequestMapping("piglet")
public class PigletController extends AbstractController<Piglet, Integer> {

	@Autowired
	private PigletService pigletService;

	@Override
	public String getViewBasePath() {
		return "piglet";
	}

	@Override
	public BaseService getBaseService() {
		return pigletService;
	}

}
