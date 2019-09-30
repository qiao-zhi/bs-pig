package cn.qs.controller.appro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.appro.Appro3;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.appro.ApproService3;

@Controller
@RequestMapping("appro3")
public class ApproController3 extends AbstractController<Appro3, Integer> {

	@Autowired
	private ApproService3 approService3;

	@Override
	public String getViewBasePath() {
		return "appro3";
	}

	@Override
	public BaseService getBaseService() {
		return approService3;
	}

}