package daomvcsingleton.dao;

import daomvcsingleton.connect.Baglanti;
import daomvcsingleton.entity.LisansEntity;
import daomvcsingleton.interfaces.IYukumluluk;
import javafx.collections.ObservableList;

public class LisansDao implements IYukumluluk<LisansEntity> {
    private static final String SQL_INSERT="INSERT INTO lisanslar (lisans_adi,baslangic_tarihi,kalan_sure,fkTC) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_UPDATEADMIN="UPDATE lisanslar SET lisans_adi=?,baslangic_tarihi=?,kalan_sure=?,fkTC=?";
    private static final String SQL_DELETE="DELETE FROM lisanslar WHERE fkTC=?";
    private static final String SQL_READ="SELECT * FROM lisanslar WHERE fkTC = ?";
    private static final String SQL_READ_ALL="SELECT * FROM lisanslar";

    private static final Baglanti baglanti=Baglanti.baglantiAc();

    @Override
    public boolean create(LisansEntity create) {
        return false;
    }

    @Override
    public boolean delete(Object key) {
        return false;
    }

    @Override
    public boolean updateUser(LisansEntity update, Object key) {
        return false;
    }

    @Override
    public boolean updateAdmin(LisansEntity update, Object key) {
        return false;
    }

    @Override
    public LisansEntity read(Object key) {
        return null;
    }

    @Override
    public ObservableList<LisansEntity> readAll() {
        return null;
    }
}
