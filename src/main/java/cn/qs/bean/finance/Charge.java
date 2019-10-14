package cn.qs.bean.finance;

import javax.persistence.Entity;

import cn.qs.bean.AbstractSequenceEntity;
@Entity
public class Charge extends AbstractSequenceEntity {

	/**
	 * 协议
	 */
	private String fee;

	/**
	 * 退款条约
	 */
	private String refuse;

	/**
	 * 税收
	 */
	private String taxi;

	private String remark1;

	private String remark2;

	private String remark3;

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getRefuse() {
		return refuse;
	}

	public void setRefuse(String refuse) {
		this.refuse = refuse;
	}

	public String getTaxi() {
		return taxi;
	}

	public void setTaxi(String taxi) {
		this.taxi = taxi;
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
