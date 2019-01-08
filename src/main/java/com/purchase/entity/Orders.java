package com.purchase.entity;

import java.util.Date;

public class Orders {
    private String orderid;

    private String supplier;

    private String orderpeople;

    private Date ordertime;

    private Date arrivaltime;

    private String needsids;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getOrderpeople() {
        return orderpeople;
    }

    public void setOrderpeople(String orderpeople) {
        this.orderpeople = orderpeople == null ? null : orderpeople.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getNeedsids() {
        return needsids;
    }

    public void setNeedsids(String needsids) {
        this.needsids = needsids == null ? null : needsids.trim();
    }
}