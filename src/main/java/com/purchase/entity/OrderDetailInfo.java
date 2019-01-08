package com.purchase.entity;

public class OrderDetailInfo {
	private String orderId;
	private String equipName;
	private String equipspec;
	private String equipModel;
	private String equipText;
	private Integer needNum;
	private String needState;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getEquipName() {
		return equipName;
	}

	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}

	public String getEquipspec() {
		return equipspec;
	}

	public void setEquipspec(String equipspec) {
		this.equipspec = equipspec;
	}

	public String getEquipModel() {
		return equipModel;
	}

	public void setEquipModel(String equipModel) {
		this.equipModel = equipModel;
	}

	public String getEquipText() {
		return equipText;
	}

	public void setEquipText(String equipText) {
		this.equipText = equipText;
	}

	public Integer getNeedNum() {
		return needNum;
	}

	public void setNeedNum(Integer needNum) {
		this.needNum = needNum;
	}

	public String getNeedState() {
		return needState;
	}

	public void setNeedState(String needState) {
		this.needState = needState;
	}
}
