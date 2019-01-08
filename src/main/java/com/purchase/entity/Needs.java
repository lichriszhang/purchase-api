package com.purchase.entity;

import java.util.Date;

public class Needs {
    private String needsid;

    private String orgname;

    private Date submitdate;

    private String submiter;

    private String orgprincipal;

    private String equipid;

    private Integer equipnum;

    private String equipstate;

    private Integer ispass;

    private String supplier;

    public String getNeedsid() {
        return needsid;
    }

    public void setNeedsid(String needsid) {
        this.needsid = needsid == null ? null : needsid.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
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
        this.submiter = submiter == null ? null : submiter.trim();
    }

    public String getOrgprincipal() {
        return orgprincipal;
    }

    public void setOrgprincipal(String orgprincipal) {
        this.orgprincipal = orgprincipal == null ? null : orgprincipal.trim();
    }

    public String getEquipid() {
        return equipid;
    }

    public void setEquipid(String equipid) {
        this.equipid = equipid == null ? null : equipid.trim();
    }

    public Integer getEquipnum() {
        return equipnum;
    }

    public void setEquipnum(Integer equipnum) {
        this.equipnum = equipnum;
    }

    public String getEquipstate() {
        return equipstate;
    }

    public void setEquipstate(String equipstate) {
        this.equipstate = equipstate == null ? null : equipstate.trim();
    }

    public Integer getIspass() {
        return ispass;
    }

    public void setIspass(Integer ispass) {
        this.ispass = ispass;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }
}