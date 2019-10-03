package cn.qs.bean.info;

import javax.persistence.Entity;

import cn.qs.bean.AbstractSequenceEntity;

/**
 * 每日推送
 */
@Entity
public class DailyPush extends AbstractSequenceEntity {

	private String virus;
	
	private String address;

	/**
	 * 价格趋势
	 */
	private String priceAttend;

	/**
	 * 条例
	 */
	private String clause;

	/**
	 * 准则
	 */
	private String rules;

	private String remark1;

	private String remark2;

	private String remark3;

	public String getVirus() {
		return virus;
	}

	public void setVirus(String virus) {
		this.virus = virus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPriceAttend() {
		return priceAttend;
	}

	public void setPriceAttend(String priceAttend) {
		this.priceAttend = priceAttend;
	}

	public String getClause() {
		return clause;
	}

	public void setClause(String clause) {
		this.clause = clause;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

}
