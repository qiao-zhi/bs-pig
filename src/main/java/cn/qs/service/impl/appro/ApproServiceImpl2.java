package cn.qs.service.impl.appro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.appro.Appro2;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.appro.ApproMapper2;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.appro.ApproService2;

@Service
public class ApproServiceImpl2 extends AbastractBaseSequenceServiceImpl<Appro2> implements ApproService2 {
	@Autowired
	private ApproMapper2 approMapper2;

	@Override
	public BaseCRUDMapper<Appro2, Integer> getBaseCRUDMapper() {
		return approMapper2;
	}

}
