package com.purchase.entity;

public class Category {
    private String equipcategory;

    private String equipcategoryname;

    public String getEquipcategory() {
        return equipcategory;
    }

    public void setEquipcategory(String equipcategory) {
        this.equipcategory = equipcategory == null ? null : equipcategory.trim();
    }

    public String getEquipcategoryname() {
        return equipcategoryname;
    }

    public void setEquipcategoryname(String equipcategoryname) {
        this.equipcategoryname = equipcategoryname == null ? null : equipcategoryname.trim();
    }
}