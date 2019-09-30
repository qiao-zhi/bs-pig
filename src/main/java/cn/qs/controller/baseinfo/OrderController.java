package cn.qs.controller.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.baseinfo.Order;
import cn.qs.controller.AbstractController;
import cn.qs.service.BaseService;
import cn.qs.service.baseinfo.OrderService;

@Controller
@RequestMapping("order")
public class OrderController extends AbstractController<Order, Integer> {

	@Autowired
	private OrderService orderService;

	@Override
	public String getViewBasePath() {
		return "order";
	}

	@Override
	public BaseService<Order, Integer> getBaseService() {
		return orderService;
	}

}
