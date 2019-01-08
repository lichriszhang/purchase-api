package com.purchase.entity;

import java.util.Date;
import java.util.List;

public class OrderFormDetail {

	/**
	 * �ɹ�������ϸ��Ϣ
	 */
	private String orderId;
	private String supplierId;
	private String supplierName;
	private String supplierContacter;
	private String supplierPhone;
	private String supplierTele;
	private String supplierBankAccount;
	private String orderCreater;
	private Date orderCreateTime;
	private Date arrivalTime;
	private List<OrderDetailInfo> orderDetailList;

	public List<OrderDetailInfo> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetailInfo> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierContacter() {
		return supplierContacter;
	}

	public void setSupplierContacter(String supplierContacter) {
		this.supplierContacter = supplierContacter;
	}

	public String getSupplierPhone() {
		return supplierPhone;
	}

	public void setSupplierPhone(String supplierPhone) {
		this.supplierPhone = supplierPhone;
	}

	public String getSupplierTele() {
		return supplierTele;
	}

	public void setSupplierTele(String supplierTele) {
		this.supplierTele = supplierTele;
	}

	public String getSupplierBankAccount() {
		return supplierBankAccount;
	}

	public void setSupplierBankAccount(String supplierBankAccount) {
		this.supplierBankAccount = supplierBankAccount;
	}

	public String getOrderCreater() {
		return orderCreater;
	}

	public void setOrderCreater(String orderCreater) {
		this.orderCreater = orderCreater;
	}

	public Date getOrderCreateTime() {
		return orderCreateTime;
	}

	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

}
