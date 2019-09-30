package cn.qs.controller.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.baseinfo.TradeProto;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.baseinfo.TradeProtoService;

@Controller
@RequestMapping("tradeProto")
public class TradeProtoController extends AbstractController<TradeProto, Integer> {

	@Autowired
	private TradeProtoService tradeProto;

	@Override
	public String getViewBasePath() {
		return "tradeProto";
	}

	@Override
	public BaseService<TradeProto, Integer> getBaseService() {
		return tradeProto;
	}

}
