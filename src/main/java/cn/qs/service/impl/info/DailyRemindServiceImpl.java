package cn.qs.service.impl.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.info.DailyRemind;
import cn.qs.mapper.BaseCRUDMapper;
import cn.qs.mapper.info.DailyRemindMapper;
import cn.qs.service.AbastractBaseSequenceServiceImpl;
import cn.qs.service.info.DailyRemindService;

/**
 * 每日推送
 */
@Service
public class DailyRemindServiceImpl extends AbastractBaseSequenceServiceImpl<DailyRemind>
		implements DailyRemindService {

	@Autowired
	private DailyRemindMapper dailyRemindMapper;

	@Override
	public BaseCRUDMapper<DailyRemind, Integer> getBaseCRUDMapper() {
		return dailyRemindMapper;
	}

}
