package com.hacidoganilbars.entity;

public class Kategoriler {
    private int id;
    private String isim;

    public Kategoriler() {
    }

    public Kategoriler(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
