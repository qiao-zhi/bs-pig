package cn.qs.service.impl.report;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.mapper.report.ReportMapper;
import cn.qs.service.report.ReportService;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportMapper reportMapper;

	public List<Map<String, Object>> report1(Map condition) {
		return reportMapper.report1(condition);
	}
}
