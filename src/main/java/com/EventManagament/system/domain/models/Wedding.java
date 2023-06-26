package com.EventManagament.system.domain.models;

import java.math.BigInteger;
import java.util.Map;

public class Wedding {
    private BigInteger idWedding;
    private Integer dniNumberHusband;
    private Integer dniNumberWife;
    private String nameHusband;
    private String nameWife;
    private Boolean available;
    private Map<Integer,String> listGuest;

    public Wedding(BigInteger idWedding, Integer dniNumberHusband, Integer dniNumberWife, String nameHusband, String nameWife, Boolean available, Map<Integer, String> listGuest) {
        this.idWedding = idWedding;
        this.dniNumberHusband = dniNumberHusband;
        this.dniNumberWife = dniNumberWife;
        this.nameHusband = nameHusband;
        this.nameWife = nameWife;
        this.available = available;
        this.listGuest = listGuest;
    }
    public Wedding(){}

    public BigInteger getIdWedding() {
        return idWedding;
    }

    public void setIdWedding(BigInteger idWedding) {
        this.idWedding = idWedding;
    }

    public Integer getDniNumberHusband() {
        return dniNumberHusband;
    }

    public void setDniNumberHusband(Integer dniNumberHusband) {
        this.dniNumberHusband = dniNumberHusband;
    }

    public Integer getDniNumberWife() {
        return dniNumberWife;
    }

    public void setDniNumberWife(Integer dniNumberWife) {
        this.dniNumberWife = dniNumberWife;
    }

    public String getNameHusband() {
        return nameHusband;
    }

    public void setNameHusband(String nameHusband) {
        this.nameHusband = nameHusband;
    }

    public String getNameWife() {
        return nameWife;
    }

    public void setNameWife(String nameWife) {
        this.nameWife = nameWife;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Map<Integer, String> getListGuest() {
        return listGuest;
    }

    public void setListGuest(Map<Integer, String> listGuest) {
        this.listGuest = listGuest;
    }
}
