package cn.qs.service.impl.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.finance.Agree;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.finance.AgreeMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.finance.AgreeService;

/**
 * 协议
 */
@Service
public class AgreeServiceImpl extends AbastractBaseSequenceServiceImpl<Agree> implements AgreeService {

	@Autowired
	private AgreeMapper agreeMapper;
	
	@Override
	public BaseCRUDMapper<Agree, Integer> getBaseCRUDMapper() {
		return agreeMapper;
	}


}
