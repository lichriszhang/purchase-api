package com.purchase.entity;

public class Supplier {
    private String supplierid;

    private String suppliername;

    private String supplieradd;

    private String suppliercontacter;

    private String suppliertele;

    private String supplierphone;

    private String supplierfax;

    private String suppliermail;

    private String supplierzipcode;

    private String supplierbankaccount;

    private String supplierequipcategory;

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getSupplieradd() {
        return supplieradd;
    }

    public void setSupplieradd(String supplieradd) {
        this.supplieradd = supplieradd == null ? null : supplieradd.trim();
    }

    public String getSuppliercontacter() {
        return suppliercontacter;
    }

    public void setSuppliercontacter(String suppliercontacter) {
        this.suppliercontacter = suppliercontacter == null ? null : suppliercontacter.trim();
    }

    public String getSuppliertele() {
        return suppliertele;
    }

    public void setSuppliertele(String suppliertele) {
        this.suppliertele = suppliertele == null ? null : suppliertele.trim();
    }

    public String getSupplierphone() {
        return supplierphone;
    }

    public void setSupplierphone(String supplierphone) {
        this.supplierphone = supplierphone == null ? null : supplierphone.trim();
    }

    public String getSupplierfax() {
        return supplierfax;
    }

    public void setSupplierfax(String supplierfax) {
        this.supplierfax = supplierfax == null ? null : supplierfax.trim();
    }

    public String getSuppliermail() {
        return suppliermail;
    }

    public void setSuppliermail(String suppliermail) {
        this.suppliermail = suppliermail == null ? null : suppliermail.trim();
    }

    public String getSupplierzipcode() {
        return supplierzipcode;
    }

    public void setSupplierzipcode(String supplierzipcode) {
        this.supplierzipcode = supplierzipcode == null ? null : supplierzipcode.trim();
    }

    public String getSupplierbankaccount() {
        return supplierbankaccount;
    }

    public void setSupplierbankaccount(String supplierbankaccount) {
        this.supplierbankaccount = supplierbankaccount == null ? null : supplierbankaccount.trim();
    }

    public String getSupplierequipcategory() {
        return supplierequipcategory;
    }

    public void setSupplierequipcategory(String supplierequipcategory) {
        this.supplierequipcategory = supplierequipcategory == null ? null : supplierequipcategory.trim();
    }
}