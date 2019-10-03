package cn.qs.service.impl.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.info.DailyPush;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.info.DailyPushMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.info.DailyPushService;

/**
 * 每日推送
 */
@Service
public class DailyPushServiceImpl extends AbastractBaseSequenceServiceImpl<DailyPush>
		implements DailyPushService {

	@Autowired
	private DailyPushMapper dailyPushMapper;
	
	@Override
	public BaseCRUDMapper<DailyPush, Integer> getBaseCRUDMapper() {
		return dailyPushMapper;
	}

}
