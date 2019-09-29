package cn.qs.service.impl.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;

import cn.qs.bean.baseinfo.Piglet;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.baseinfo.PigletMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.BaseSequenceService;

public class PigletService extends AbastractBaseSequenceServiceImpl<Piglet> implements BaseSequenceService<Piglet> {

	@Autowired
	private PigletMapper pigletMapper;

	@Override
	public BaseCRUDMapper<Piglet, Integer> getBaseCRUDMapper() {
		return pigletMapper;
	}

}
