package cn.qs.controller.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.baseinfo.Farm;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.baseinfo.FarmService;

@Controller
@RequestMapping("farm")
public class FarmController extends AbstractController<Farm, Integer> {

	@Autowired
	private FarmService farmService;

	@Override
	public String getViewBasePath() {
		return "farm";
	}

	@Override
	public BaseService getBaseService() {
		return farmService;
	}

}
