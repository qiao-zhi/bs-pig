package cn.qs.service.impl.appro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.appro.Appro;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.appro.ApproMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.appro.ApproService;

@Service
public class ApproServiceImpl extends AbastractBaseSequenceServiceImpl<Appro> implements ApproService {
	@Autowired
	private ApproMapper approMapper;

	@Override
	public BaseCRUDMapper<Appro, Integer> getBaseCRUDMapper() {
		return approMapper;
	}

}
