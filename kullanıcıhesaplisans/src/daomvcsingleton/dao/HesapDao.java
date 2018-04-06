package daomvcsingleton.dao;

import daomvcsingleton.connect.Baglanti;
import daomvcsingleton.entity.HesapEntity;
import daomvcsingleton.interfaces.IYukumluluk;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HesapDao implements IYukumluluk<HesapEntity> {

    private static final String SQL_INSERT="INSERT INTO hesaplar (kullanici_adi,sifre) VALUES (?, ?, ?)";
    private static final String SQL_UPDATEUSER="UPDATE hesaplar SET kullanici_adi=?,sifre=? WHERE kullanici_TC=?";
    private static final String SQL_UPDATEADMIN="UPDATE hesaplar  kullanici_adi=?,sifre=?,SET yetki=?, WHERE kullanici_TC=?";
    private static final String SQL_READ="SELECT * FROM hesaplar WHERE fkTC = ?";
    private static final String SQL_READ_ALL="SELECT * FROM hesaplar";
    private static final String SQL_GIRIS="SELECT * FROM hesaplar WHERE kullanici_adi=? and sifre=?";

    private static final Baglanti baglanti=Baglanti.baglantiAc();


    public HesapEntity read(String kulAdi,String sifre) {
        PreparedStatement ps;
        ResultSet rs;
        HesapEntity hesapEntity=null;
        try {
            ps=baglanti.getCnn().prepareStatement(SQL_GIRIS);
            ps.setString(1,kulAdi);
            ps.setString(2,sifre);
            rs=ps.executeQuery();
            while (rs.next()){
                hesapEntity=new HesapEntity(rs.getInt(1),rs.getString(2),
                        rs.getString(3),rs.getString(5));
            }
                return hesapEntity;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            baglanti.baglantiKapat();
        }
        return hesapEntity;
    }

    @Override
    public boolean create(HesapEntity create) {
        PreparedStatement ps;
        try {
            ps=baglanti.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(2,create.getKullaniciAdi());
            ps.setString(3,create.getSifre());
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
    public boolean delete(Object key) {

        return false;
    }

    @Override
    public boolean updateUser(HesapEntity update,Object key) {
        PreparedStatement ps;
        try {
            ps=baglanti.getCnn().prepareStatement(SQL_UPDATEUSER);
            ps.setString(1,update.getKullaniciAdi());
            ps.setString(2,update.getSifre());
            ps.setString(3,key.toString());
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

    public boolean updateAdmin(HesapEntity update,Object key) {
        PreparedStatement ps;
        try {
            ps=baglanti.getCnn().prepareStatement(SQL_UPDATEADMIN);
            ps.setString(1,update.getKullaniciAdi());
            ps.setString(2,update.getSifre());
            ps.setString(3,update.getYetki());
            ps.setString(4,key.toString());
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
    public HesapEntity read(Object key) {
        PreparedStatement ps;
        ResultSet rs;
        HesapEntity hesapEntity=null;
        try {
            ps=baglanti.getCnn().prepareStatement(SQL_READ);
            ps.setString(1,key.toString());
            rs=ps.executeQuery();
            while (rs.next()){
                hesapEntity=new HesapEntity(rs.getInt(1),rs.getString(2),
                        rs.getString(3),rs.getString(4));
            }return hesapEntity;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            baglanti.baglantiKapat();
        }
        return hesapEntity;
    }

    @Override
    public ObservableList<HesapEntity> readAll() {
        PreparedStatement ps;
        ResultSet rs;
        ObservableList<HesapEntity> hesapList= FXCollections.observableArrayList();
        try {
            ps=baglanti.getCnn().prepareStatement(SQL_READ_ALL);
            rs= ps.executeQuery();
            while(rs.next()){
                hesapList.add(new HesapEntity(rs.getInt(1),rs.getString(2),
                        rs.getString(3), rs.getString(4)));
            }return hesapList;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            baglanti.baglantiKapat();
        }
        return hesapList;
    }


}