package cn.qs.bean.appro;

import javax.persistence.Entity;

import cn.qs.bean.AbstractSequenceEntity;
@Entity
public class Appro3 extends AbstractSequenceEntity {

	/**** 入库情况 **/

	/**
	 * 健康状况
	 */
	private String healthy;

	/**
	 * 供应量
	 */
	private String supplyQuantity;

	private String price;

	private String quantity;
	/**** 入库情况 **/

	/**** 审核猪情况 **/

	/**
	 * 猪编号
	 */
	private String pigletNumber;

	private String pigHealth;

	private String pigNotHealth;
	/**** 审核猪情况 **/

	/****** 审核猪来源 ********/
	/**
	 * 出货单位
	 */
	private String shippingUnit;

	/**
	 * 购货单位
	 */
	private String purchaseUnit;

	/***** 审核猪来源 *********/

	public String getHealthy() {
		return healthy;
	}

	public void setHealthy(String healthy) {
		this.healthy = healthy;
	}

	public String getSupplyQuantity() {
		return supplyQuantity;
	}

	public void setSupplyQuantity(String supplyQuantity) {
		this.supplyQuantity = supplyQuantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPigletNumber() {
		return pigletNumber;
	}

	public void setPigletNumber(String pigletNumber) {
		this.pigletNumber = pigletNumber;
	}

	public String getPigHealth() {
		return pigHealth;
	}

	public void setPigHealth(String pigHealth) {
		this.pigHealth = pigHealth;
	}

	public String getPigNotHealth() {
		return pigNotHealth;
	}

	public void setPigNotHealth(String pigNotHealth) {
		this.pigNotHealth = pigNotHealth;
	}

	public String getShippingUnit() {
		return shippingUnit;
	}

	public void setShippingUnit(String shippingUnit) {
		this.shippingUnit = shippingUnit;
	}

	public String getPurchaseUnit() {
		return purchaseUnit;
	}

	public void setPurchaseUnit(String purchaseUnit) {
		this.purchaseUnit = purchaseUnit;
	}

}
