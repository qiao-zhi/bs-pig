package cn.qs.service.impl.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.baseinfo.Farm;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.baseinfo.FarmMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.baseinfo.FarmService;

@Service
public class FarmServiceImpl extends AbastractBaseSequenceServiceImpl<Farm> implements FarmService {

	@Autowired
	private FarmMapper farmMapper;

	@Override
	public BaseCRUDMapper<Farm, Integer> getBaseCRUDMapper() {
		return farmMapper;
	}

}
