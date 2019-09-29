package cn.qs.controller.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.baseinfo.Abattoir;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.baseinfo.AbattoirService;

@Controller
@RequestMapping("abattoir")
public class AbattoirController extends AbstractController<Abattoir, Integer> {

	@Autowired
	private AbattoirService abattoirService;
	
	@Override
	public String getViewBasePath() {
		return "abattoir";
	}

	@Override
	public BaseService getBaseService() {
		return abattoirService;
	}

}
