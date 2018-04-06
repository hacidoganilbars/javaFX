package sample;

import daomvcsingleton.dao.HesapDao;
import daomvcsingleton.entity.HesapEntity;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField tfKul;
    public TextField tfSifre;
    public Label lblSonuc;

    public void btnAction(ActionEvent actionEvent) {
        HesapDao hesapDao=new HesapDao();
        HesapEntity hesapEntity=hesapDao.read(tfKul.getText(),tfSifre.getText());
        HesapEntity hesapEntity1=hesapDao.read("1","1");
        if(hesapEntity!=null){
            lblSonuc.setText(hesapEntity.getKullaniciTC()+" GİRİŞ BAŞARILI");
        }else{
            lblSonuc.setText(hesapEntity1.getKullaniciTC()+" GİRİŞ BAŞARISIZ");
        }





    }
}
