package com.purchase.entity;

import java.util.Date;

public class SubmitInfo {
	private String needId;
	private String orgName;
	private Date submitdate;
	private String submiter;
	private String orgPrincipal;
	private Integer equiptmentNum;
	private String needState;
	public Integer getEquiptmentNum() {
		return equiptmentNum;
	}
	public void setEquiptmentNum(Integer equiptmentNum) {
		this.equiptmentNum = equiptmentNum;
	}
	public String getNeedState() {
		return needState;
	}
	public void setNeedState(String needState) {
		this.needState = needState;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Date getSubmitdate() {
		return submitdate;
	}
	public void setSubmitdate(Date submitdate) {
		this.submitdate = submitdate;
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
	public String getNeedId() {
		return needId;
	}
	public void setNeedId(String needId) {
		this.needId = needId;
	}
}
