package cn.qs.service.impl.appro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.appro.Appro3;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.appro.ApproMapper3;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.appro.ApproService3;

@Service
public class ApproServiceImpl3 extends AbastractBaseSequenceServiceImpl<Appro3> implements ApproService3 {
	@Autowired
	private ApproMapper3 approMapper3;

	@Override
	public BaseCRUDMapper<Appro3, Integer> getBaseCRUDMapper() {
		return approMapper3;
	}

}
