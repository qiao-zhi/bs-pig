package cn.qs.service.impl.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.finance.Charge;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.finance.ChargeMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.finance.ChargeService;
@Service
public class ChargeServiceImpl extends AbastractBaseSequenceServiceImpl<Charge> implements ChargeService {

	@Autowired
	private ChargeMapper chargeMapper;
	
	@Override
	public BaseCRUDMapper<Charge, Integer> getBaseCRUDMapper() {
		return chargeMapper;
	}


}