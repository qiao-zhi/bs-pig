package cn.qs.controller.appro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.appro.Appro;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.appro.ApproService;

@Controller
@RequestMapping("appro")
public class ApproController extends AbstractController<Appro, Integer> {

	@Autowired
	private ApproService approService;

	@Override
	public String getViewBasePath() {
		return "appro";
	}

	@Override
	public BaseService getBaseService() {
		return approService;
	}

}