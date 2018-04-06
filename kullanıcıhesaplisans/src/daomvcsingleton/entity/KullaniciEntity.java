package daomvcsingleton.entity;

public class KullaniciEntity {
    private String TC;
    private String isim;
    private String soyIsim;
    private String mail;
    private String telefon;
    private String cinsiyet;
    private HesapEntity hesap;
    private int hesapIdFk;

    public KullaniciEntity() {
    }

    public KullaniciEntity(String TC) {
        this.TC = TC;
    }

    public KullaniciEntity(String TC, String isim, String soyIsim, String mail, String telefon, String cinsiyet) {
        this.TC = TC;
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.mail = mail;
        this.telefon = telefon;
        this.cinsiyet = cinsiyet;
        this.hesap=hesap;
        this.hesapIdFk = hesapIdFk;
    }

    public HesapEntity getHesap() {
        return hesap;
    }

    public void setHesap(HesapEntity hesap) {
        this.hesap = hesap;
    }

    public int getHesapIdFk() {
        return hesapIdFk;
    }

    public void setHesapIdFk(int hesapIdFk) {
        this.hesapIdFk = hesapIdFk;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
