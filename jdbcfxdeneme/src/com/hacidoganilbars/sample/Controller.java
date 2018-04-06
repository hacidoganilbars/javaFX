package com.hacidoganilbars.sample;

import com.hacidoganilbars.dao.FilmlerDao;
import com.hacidoganilbars.entity.Filmler;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Controller {


    public TextArea textArea;

    public void veriGetir(ActionEvent actionEvent) {
        FilmlerDao filmlerDao=new FilmlerDao();
        ArrayList<Filmler> filmlerArrayList= filmlerDao.butunFilmleriGetir();
        StringBuilder sb=new StringBuilder();
        for (Filmler filmler:filmlerArrayList) {
            sb.append(filmler.getId()+" ");
            sb.append(filmler.getIsim()+" ");
            sb.append(filmler.getSene()+" ");
            sb.append("\n");
            //sb.append(filmler+"\n");
        }
        textArea.setText(sb.toString());


    }
}
