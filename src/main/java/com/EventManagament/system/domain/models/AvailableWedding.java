package com.EventManagament.system.domain.models;

import java.math.BigInteger;

public class AvailableWedding {
    private BigInteger idWedding;
    private Boolean available;

    public AvailableWedding(BigInteger idWedding, Boolean available) {
        this.idWedding = idWedding;
        this.available = available;
    }

    public BigInteger getIdWedding() {
        return idWedding;
    }

    public void setIdWedding(BigInteger idWedding) {
        this.idWedding = idWedding;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
