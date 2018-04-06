package com.hacidoganilbars.entity;

public class Filmler {


    private int id;
    private String isim;
    private int yonetmen_id;
    private int kategori_id;
    private int sene;

    public Filmler() {
    }


    public Filmler(int id, String isim, int sene) {
        this.id = id;
        this.isim = isim;
        this.sene = sene;
    }

    public Filmler(int id, String isim, int yonetmen_id, int kategori_id, int sene) {
        this.id = id;
        this.isim = isim;
        this.yonetmen_id = yonetmen_id;
        this.kategori_id = kategori_id;
        this.sene = sene;
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

    public int getYonetmen_id() {
        return yonetmen_id;
    }

    public void setYonetmen_id(int yonetmen_id) {
        this.yonetmen_id = yonetmen_id;
    }

    public int getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    public int getSene() {
        return sene;
    }

    public void setSene(int sene) {
        this.sene = sene;
    }

    @Override
    public String toString() {
        return this.id+"-"+this.isim+"-"+this.sene;
    }
}
