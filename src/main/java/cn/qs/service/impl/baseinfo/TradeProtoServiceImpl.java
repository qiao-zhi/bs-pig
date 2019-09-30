package cn.qs.service.impl.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.baseinfo.TradeProto;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.baseinfo.TradeProtoMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.baseinfo.TradeProtoService;

@Service
public class TradeProtoServiceImpl extends AbastractBaseSequenceServiceImpl<TradeProto> implements TradeProtoService {

	@Autowired
	private TradeProtoMapper tradeProtoMapper;

	@Override
	public BaseCRUDMapper<TradeProto, Integer> getBaseCRUDMapper() {
		return tradeProtoMapper;
	}

}
