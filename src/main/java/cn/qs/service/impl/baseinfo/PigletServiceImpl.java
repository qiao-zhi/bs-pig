package cn.qs.service.impl.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.baseinfo.Piglet;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.baseinfo.PigletMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.baseinfo.PigletService;

@Service
public class PigletServiceImpl extends AbastractBaseSequenceServiceImpl<Piglet>
		implements PigletService {

	@Autowired
	private PigletMapper pigletMapper;

	@Override
	public BaseCRUDMapper<Piglet, Integer> getBaseCRUDMapper() {
		return pigletMapper;
	}

}
