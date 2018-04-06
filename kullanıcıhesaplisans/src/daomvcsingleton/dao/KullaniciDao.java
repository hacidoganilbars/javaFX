package daomvcsingleton.dao;

import daomvcsingleton.connect.Baglanti;
import daomvcsingleton.entity.HesapEntity;
import daomvcsingleton.entity.KullaniciEntity;
import daomvcsingleton.interfaces.IYukumluluk;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KullaniciDao implements IYukumluluk<KullaniciEntity> {
    private static final String SQL_INSERT="INSERT INTO kullanicilar (TC, isim, soy_isim, cinsiyet, telefon, mail, fkhesap_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE="UPDATE kullanicilar SET isim=?, soy_isim=?, cinsiyet=?, telefon=?, mail=? fkhesap_id=? WHERE TC=?";
    private static final String SQL_DELETE="DELETE FROM kullanicilar WHERE TC = ?";
    private static final String SQL_READ="SELECT * FROM kullanicilar WHERE TC = ?";
    private static final String SQL_READ_ALL="SELECT * FROM kullanicilar";

    private static final Baglanti baglanti=Baglanti.baglantiAc();

    @Override
    public boolean create(KullaniciEntity create) {
        PreparedStatement ps;
        try {
            ps=baglanti.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, create.getTC());
            ps.setString(2,create.getIsim());
            ps.setString(3,create.getSoyIsim());
            ps.setString(4,create.getCinsiyet());
            ps.setString(5,create.getTelefon());
            ps.setString(6,create.getMail());
            ps.setInt(7,create.getHesapIdFk());
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        PreparedStatement ps;
        try {
            ps=baglanti.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1,key.toString());
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            baglanti.baglantiKapat();
        }
        return false;
    }

    @Override
    public boolean updateUser(KullaniciEntity update, Object key) {
        PreparedStatement ps;
        try {
            ps=baglanti.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,update.getIsim());
            ps.setString(2,update.getSoyIsim());
            ps.setString(3,update.getCinsiyet());
            ps.setString(4,update.getTelefon());
            ps.setString(5,update.getMail());
            ps.setString(7,update.getTC());
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            baglanti.baglantiKapat();
        }
        return false;
    }

    @Override
    public boolean updateAdmin(KullaniciEntity update, Object key) {
        return false;
    }

    @Override
    public KullaniciEntity read(Object key) {
        PreparedStatement ps;
        ResultSet rs;
        KullaniciEntity kullaniciEntity=null;
        HesapEntity hesapEntity=null;

        try {
            ps=baglanti.getCnn().prepareStatement(SQL_READ);
            ps.setString(1,key.toString());
            rs=ps.executeQuery();
            while (rs.next()){
                kullaniciEntity=new KullaniciEntity(rs.getString(1),rs.getString(2),
                        rs.getString(3),rs.getString(4),rs.getString(5),
                        rs.getString(6));
            }
            return kullaniciEntity;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            baglanti.baglantiKapat();
        }
        return kullaniciEntity;
    }

    @Override
    public ObservableList<KullaniciEntity> readAll() {
        PreparedStatement ps;
        ResultSet rs;
        ObservableList<KullaniciEntity> kullaniciList= FXCollections.observableArrayList();
        HesapEntity hesapEntity=null;
        try {
            ps=baglanti.getCnn().prepareStatement(SQL_READ_ALL);
            rs=ps.executeQuery();
            while(rs.next()){
                kullaniciList.add(new KullaniciEntity(rs.getString(1),rs.getString(2),
                        rs.getString(3),rs.getString(4),rs.getString(5),
                        rs.getString(6)));
            }
            return kullaniciList;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            baglanti.baglantiKapat();
        }

        return kullaniciList;
    }
}
