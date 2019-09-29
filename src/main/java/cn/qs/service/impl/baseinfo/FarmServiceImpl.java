package cn.qs.service.impl.baseinfo;

import cn.qs.bean.baseinfo.Farm;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.BaseSequenceService;

public class FarmServiceImpl extends AbastractBaseSequenceServiceImpl<Farm> implements BaseSequenceService<Farm> {

	@Override
	public BaseCRUDMapper<Farm, Integer> getBaseCRUDMapper() {
		return null;
	}

}
