package com.example.pocketsafe;


import java.io.Serializable;

public class MonthModel {
    private String mes;
    private String monto;
    private int image;

    public MonthModel(String mes, String monto, int image) {
        this.mes = mes;
        this.monto = monto;
        this.image = image;
    }

    public String getMes() {
        return mes;
    }

    public String getMonto() {
        return monto;
    }

    public int getImage() {
        return image;
    }
}
