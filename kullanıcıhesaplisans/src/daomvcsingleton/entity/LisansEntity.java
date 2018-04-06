package daomvcsingleton.entity;

import javafx.collections.ObservableList;

public class LisansEntity {
    private int lisansId;
    private String lisansAdi;
    private String baslangicTarihi;
    private String kalanSure;
    private int kullaniciTC;
    private ObservableList<KullaniciEntity> kullaniciList;

    public LisansEntity() {
    }

    public LisansEntity(int lisansId) {
        this.lisansId = lisansId;
    }


    public LisansEntity(int lisansId, String lisansAdi, String baslangicTarihi, String kalanSure, int kullaniciTC, ObservableList<KullaniciEntity> kullaniciList) {
        this.lisansId = lisansId;
        this.lisansAdi = lisansAdi;
        this.baslangicTarihi = baslangicTarihi;
        this.kalanSure = kalanSure;
        this.kullaniciTC= kullaniciTC;
        this.kullaniciList = kullaniciList;
    }

    public int getKullaniciIdFk() {
        return kullaniciTC;
    }

    public void setKullaniciIdFk(int hesapIdFk) {
        this.kullaniciTC = kullaniciTC;
    }

    public int getLisansId() {
        return lisansId;
    }

    public void setLisansId(int lisansId) {
        this.lisansId = lisansId;
    }

    public String getLisansAdi() {
        return lisansAdi;
    }

    public void setLisansAdi(String lisansAdi) {
        this.lisansAdi = lisansAdi;
    }

    public String getKalanSure() {
        return kalanSure;
    }

    public void setKalanSure(String kalanSure) {
        this.kalanSure = kalanSure;
    }

    public String getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(String baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public ObservableList<KullaniciEntity> getKullaniciList() {
        return kullaniciList;
    }

    public void setKullaniciList(ObservableList<KullaniciEntity> kullaniciList) {
        this.kullaniciList = kullaniciList;
    }
}
