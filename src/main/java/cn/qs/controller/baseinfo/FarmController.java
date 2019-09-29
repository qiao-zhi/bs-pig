package cn.qs.controller.baseinfo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.controller.AbstractController;

@Controller
@RequestMapping("farm")
public class FarmController extends AbstractController {

	@Override
	public String getViewBasePath() {
		return "farm";
	}

}
