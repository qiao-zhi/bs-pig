package cn.qs.bean.baseinfo;

import javax.persistence.Entity;

import cn.qs.bean.AbstractSequenceEntity;

/**
 * 养殖场
 */

@Entity
public class Farm extends AbstractSequenceEntity {

	private String name;

	private String address;

	private String network;

	private String companycode;

	private String type;

	private String managerCompanyName;

	private String managerName;

	private String managerNumber;

	private String managerPhone;

	private String remark1;

	private String remark2;

	private String remark3;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getCompanycode() {
		return companycode;
	}

	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManagerCompanyName() {
		return managerCompanyName;
	}

	public void setManagerCompanyName(String managerCompanyName) {
		this.managerCompanyName = managerCompanyName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerNumber() {
		return managerNumber;
	}

	public void setManagerNumber(String managerNumber) {
		this.managerNumber = managerNumber;
	}

	public String getManagerPhone() {
		return managerPhone;
	}

	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
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
