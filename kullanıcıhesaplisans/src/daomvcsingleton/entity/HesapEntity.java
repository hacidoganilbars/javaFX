package daomvcsingleton.entity;

import javafx.collections.ObservableList;

public class HesapEntity {
    private int hesapId;
    private String kullaniciAdi;
    private String sifre;
    private String yetki;
    private String kullaniciTC;
    private ObservableList<KullaniciEntity> kullaniciList;

    public HesapEntity() {
    }

    public HesapEntity(int hesapId, String kullaniciAdi, String sifre, String kullaniciTC) {
        this.hesapId = hesapId;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.kullaniciTC = kullaniciTC;
    }

    public HesapEntity(String kullaniciAdi, String sifre, String kullaniciTC) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.kullaniciTC = kullaniciTC;
        this.kullaniciList = kullaniciList;
    }

    public int getHesapId() {
        return hesapId;
    }

    public void setHesapId(int hesapId) {
        this.hesapId = hesapId;
    }

    public String getYetki() {
        return yetki;
    }

    public void setYetki(String yetki) {
        this.yetki = yetki;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }


    public String getKullaniciTC() {
        return kullaniciTC;
    }

    public void setKullaniciTC(String kullaniciTC) {
        this.kullaniciTC = kullaniciTC;
    }

    public ObservableList<KullaniciEntity> getKullaniciList() {
        return kullaniciList;
    }

    public void setKullaniciList(ObservableList<KullaniciEntity> kullaniciList) {
        this.kullaniciList = kullaniciList;
    }
}
