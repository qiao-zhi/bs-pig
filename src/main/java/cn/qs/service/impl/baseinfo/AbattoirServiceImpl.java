package cn.qs.service.impl.baseinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.baseinfo.Abattoir;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.baseinfo.AbattoirMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.baseinfo.AbattoirService;

@Service
public class AbattoirServiceImpl extends AbastractBaseSequenceServiceImpl<Abattoir> implements AbattoirService {

	@Autowired
	private AbattoirMapper abattoirMapper;

	@Override
	public BaseCRUDMapper<Abattoir, Integer> getBaseCRUDMapper() {
		return abattoirMapper;
	}

}
