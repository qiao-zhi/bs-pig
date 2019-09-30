package cn.qs.controller.appro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.appro.Appro2;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.appro.ApproService2;

@Controller
@RequestMapping("appro2")
public class ApproController2 extends AbstractController<Appro2, Integer> {

	@Autowired
	private ApproService2 approService2;

	@Override
	public String getViewBasePath() {
		return "appro2";
	}

	@Override
	public BaseService getBaseService() {
		return approService2;
	}

}