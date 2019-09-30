package cn.qs.service.impl.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.baseinfo.Order;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.baseinfo.OrderMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.baseinfo.OrderService;

@Service
public class OrderServiceImpl extends AbastractBaseSequenceServiceImpl<Order> implements OrderService {

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public BaseCRUDMapper<Order, Integer> getBaseCRUDMapper() {
		return orderMapper;
	}

}
