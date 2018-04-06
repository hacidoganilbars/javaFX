package daomvcsingleton.controller;

import daomvcsingleton.dao.KullaniciDao;
import daomvcsingleton.entity.KullaniciEntity;
import javafx.collections.ObservableList;

public class Islem {
    public static void main(String[] args) {
        KullaniciDao dao=new KullaniciDao();

        /*
         KullaniciEntity entity=dao.read("21353822354");
         System.out.println(entity.getTC()+" "+entity.getIsim()+" "+entity.getSoyIsim()+" "+entity.getCinsiyet()
                +" "+entity.getTelefon()+" "+entity.getMail()+" "+entity.getHesapIdFk());
        */

        ObservableList<KullaniciEntity> list= dao.readAll();
        for (KullaniciEntity liste:list) {
            System.out.println(liste.getTC()+" "+liste.getIsim()+" "+liste.getSoyIsim()+" "+liste.getCinsiyet()+" "+liste.getTelefon()+" "+liste.getMail()+" "+liste.getHesapIdFk());
        }

    }
}
