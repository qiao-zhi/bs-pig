package cn.qs.service.impl.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.info.InfoPublish;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.info.InfoPublishMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.info.InfoPublishService;

/**
 * 每日推送
 */
@Service
public class InfoPublishServiceImpl extends AbastractBaseSequenceServiceImpl<InfoPublish>
		implements InfoPublishService {

	@Autowired
	private InfoPublishMapper infoPublishMapper;

	@Override
	public BaseCRUDMapper<InfoPublish, Integer> getBaseCRUDMapper() {
		return infoPublishMapper;
	}

}
