package com.purchase.entity;

import java.util.Date;

public class NeedsInfo {
	private String needId;
	private String orgName;
	private Date submitDate;
	private String submiter;
	private String orgPrincipal;
	private String equipName;
	private String equipSpec;
	private String equipModel;
	private String equipText;
	private Integer needNum;
	private String needState;
	private String supplier;
	private Integer isPass;
	private String equipCategory; 
	public String getEquipCategory() {
		return equipCategory;
	}
	public void setEquipCategory(String equipCategory) {
		this.equipCategory = equipCategory;
	}
	public Integer getIsPass() {
		return isPass;
	}
	public void setIsPass(Integer isPass) {
		this.isPass = isPass;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	public String getSubmiter() {
		return submiter;
	}
	public void setSubmiter(String submiter) {
		this.submiter = submiter;
	}
	public String getOrgPrincipal() {
		return orgPrincipal;
	}
	public void setOrgPrincipal(String orgPrincipal) {
		this.orgPrincipal = orgPrincipal;
	}
	public String getEquipName() {
		return equipName;
	}
	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}
	public String getEquipSpec() {
		return equipSpec;
	}
	public void setEquipSpec(String equipSpec) {
		this.equipSpec = equipSpec;
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
	public String getNeedId() {
		return needId;
	}
	public void setNeedId(String needId) {
		this.needId = needId;
	}
}
