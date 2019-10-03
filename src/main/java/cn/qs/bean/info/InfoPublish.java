package cn.qs.bean.info;

import javax.persistence.Entity;

import cn.qs.bean.AbstractSequenceEntity;

/**
 * 每日推送
 */
@Entity
public class InfoPublish extends AbstractSequenceEntity {

	/**
	 * 养殖场状态
	 */
	private String farmStatus;

	/**
	 * stickPigInfo
	 */
	private String stickPigInfo;

	/**
	 * 未通过猪的编号
	 */
	private String unpassPigNumber;

	/**
	 * 未通过猪原因
	 */
	private String unpassPigReason;

	private String remark1;

	private String remark2;

	private String remark3;

	public String getFarmStatus() {
		return farmStatus;
	}

	public void setFarmStatus(String farmStatus) {
		this.farmStatus = farmStatus;
	}

	public String getStickPigInfo() {
		return stickPigInfo;
	}

	public void setStickPigInfo(String stickPigInfo) {
		this.stickPigInfo = stickPigInfo;
	}

	public String getUnpassPigNumber() {
		return unpassPigNumber;
	}

	public void setUnpassPigNumber(String unpassPigNumber) {
		this.unpassPigNumber = unpassPigNumber;
	}

	public String getUnpassPigReason() {
		return unpassPigReason;
	}

	public void setUnpassPigReason(String unpassPigReason) {
		this.unpassPigReason = unpassPigReason;
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
