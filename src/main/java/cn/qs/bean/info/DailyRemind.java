package cn.qs.bean.info;

import javax.persistence.Entity;

import cn.qs.bean.AbstractSequenceEntity;

/**
 * 每日推送
 */
@Entity
public class DailyRemind extends AbstractSequenceEntity {

	private String farmTopThree;

	private String percent;

	private String quantity;

	private String avgHeight;

	private String remark1;

	private String remark2;

	private String remark3;

	public String getFarmTopThree() {
		return farmTopThree;
	}

	public void setFarmTopThree(String farmTopThree) {
		this.farmTopThree = farmTopThree;
	}

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getAvgHeight() {
		return avgHeight;
	}

	public void setAvgHeight(String avgHeight) {
		this.avgHeight = avgHeight;
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