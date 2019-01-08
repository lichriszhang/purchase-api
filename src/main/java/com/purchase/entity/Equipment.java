package com.purchase.entity;

public class Equipment {
    private String equipid;

    private String equipname;

    private String equipspec;

    private String equipmodel;

    private String equiptext;

    private Integer equipnum;

    private String equipcategory;

    public String getEquipid() {
        return equipid;
    }

    public void setEquipid(String equipid) {
        this.equipid = equipid == null ? null : equipid.trim();
    }

    public String getEquipname() {
        return equipname;
    }

    public void setEquipname(String equipname) {
        this.equipname = equipname == null ? null : equipname.trim();
    }

    public String getEquipspec() {
        return equipspec;
    }

    public void setEquipspec(String equipspec) {
        this.equipspec = equipspec == null ? null : equipspec.trim();
    }

    public String getEquipmodel() {
        return equipmodel;
    }

    public void setEquipmodel(String equipmodel) {
        this.equipmodel = equipmodel == null ? null : equipmodel.trim();
    }

    public String getEquiptext() {
        return equiptext;
    }

    public void setEquiptext(String equiptext) {
        this.equiptext = equiptext == null ? null : equiptext.trim();
    }

    public Integer getEquipnum() {
        return equipnum;
    }

    public void setEquipnum(Integer equipnum) {
        this.equipnum = equipnum;
    }

    public String getEquipcategory() {
        return equipcategory;
    }

    public void setEquipcategory(String equipcategory) {
        this.equipcategory = equipcategory == null ? null : equipcategory.trim();
    }
}