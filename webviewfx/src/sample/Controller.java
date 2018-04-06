package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private WebView webView;
    private WebEngine engine;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine=webView.getEngine();
    }

    public void btn1(ActionEvent event) {
        engine.load("https://www.google.com.tr/");
    }

    public void btn2(ActionEvent event) {
        engine.executeScript("window.location=\"http://easyonlineconverter.com//\";");
    }

    public void btn3(ActionEvent event) {
        engine.loadContent("<html>\n" +
                "  <head>\n" +
                "    <title>Basit bir HTML metni başlığı</title>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <h1>HTML, Web'in dilidir.</h1>\n" +
                "    <P>Bu metnin ilk paragrafıdır.</p>\n" +
                "    <p>Bu da ikinci paragraftır.</p>\n" +
                "  </body>\n" +
                "</html>");
    }

    public void btn4(ActionEvent event) {
        engine.reload();
    }
}
