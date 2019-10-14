package cn.qs.bean.finance;

import javax.persistence.Entity;

import cn.qs.bean.AbstractSequenceEntity;

/**
 * 协议
 */
@Entity
public class Agree extends AbstractSequenceEntity {

	/**
	 * 销售条款
	 */
	private String memberRecommand;

	/**
	 * 排名靠前
	 */
	private String topRanking;

	/**
	 * 个性名片
	 */
	private String personalCard;

	/**
	 * 销售准则
	 */
	private String saleRule;
	/**
	 * 销售条款
	 */
	private String saleTerm;

	/**
	 * 服务内容
	 */
	private String serviceContent;

	/**
	 * 服务条件
	 */
	private String serviceTerm;

	/**
	 * 终止服务
	 */
	private String serviceTerminal;

	private String remark1;

	private String remark2;

	private String remark3;

	public String getMemberRecommand() {
		return memberRecommand;
	}

	public void setMemberRecommand(String memberRecommand) {
		this.memberRecommand = memberRecommand;
	}

	public String getTopRanking() {
		return topRanking;
	}

	public void setTopRanking(String topRanking) {
		this.topRanking = topRanking;
	}

	public String getPersonalCard() {
		return personalCard;
	}

	public void setPersonalCard(String personalCard) {
		this.personalCard = personalCard;
	}

	public String getSaleRule() {
		return saleRule;
	}

	public void setSaleRule(String saleRule) {
		this.saleRule = saleRule;
	}

	public String getSaleTerm() {
		return saleTerm;
	}

	public void setSaleTerm(String saleTerm) {
		this.saleTerm = saleTerm;
	}

	public String getServiceContent() {
		return serviceContent;
	}

	public void setServiceContent(String serviceContent) {
		this.serviceContent = serviceContent;
	}

	public String getServiceTerm() {
		return serviceTerm;
	}

	public void setServiceTerm(String serviceTerm) {
		this.serviceTerm = serviceTerm;
	}

	public String getServiceTerminal() {
		return serviceTerminal;
	}

	public void setServiceTerminal(String serviceTerminal) {
		this.serviceTerminal = serviceTerminal;
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
