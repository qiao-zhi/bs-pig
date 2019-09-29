package cn.qs.service.impl.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;

import cn.qs.bean.baseinfo.Abattoir;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.baseinfo.AbattoirMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.BaseSequenceService;

public class AbattoirServiceImpl extends AbastractBaseSequenceServiceImpl<Abattoir>
		implements BaseSequenceService<Abattoir> {

	@Autowired
	private AbattoirMapper abattoirMapper;

	@Override
	public BaseCRUDMapper<Abattoir, Integer> getBaseCRUDMapper() {
		return abattoirMapper;
	}

}
