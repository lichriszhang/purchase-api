package com.purchase.entity;

/**
 * ���ɲɹ���ʱ����Ҫ�������Ϣ
 * @author ��˧
 *
 */
public class OrderAppendInfo {
	private String orderId;
	private String orderCreater;
	private Integer arrivalDay;
	private String needId;
	private String supplier;
	private String equipCategory;

	public String getEquipCategory() {
		return equipCategory;
	}

	public void setEquipCategory(String equipCategory) {
		this.equipCategory = equipCategory;
	}

	public String getNeedId() {
		return needId;
	}

	public void setNeedId(String needId) {
		this.needId = needId;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderCreater() {
		return orderCreater;
	}

	public void setOrderCreater(String orderCreater) {
		this.orderCreater = orderCreater;
	}

	public Integer getArrivalDay() {
		return arrivalDay;
	}

	public void setArrivalDay(Integer arrivalDay) {
		this.arrivalDay = arrivalDay;
	}


}
