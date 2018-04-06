package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    final MyNumber myNumber=new MyNumber();

    @FXML
    private ProgressBar pb;
    @FXML
    private ProgressIndicator pi;

    @FXML
    private Label lblStatus;




    @Override
    public void initialize(URL location, ResourceBundle resources) {

        myNumber.setNumber(0);

     /*  // btnClick(ActionEvent actionEvent)
      *     myNumber.numberProperty().addListener(new ChangeListener<Number>() {
      *      @Override
      *      public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
      *          lblStatus.setText(new Double(myNumber.getNumber()).toString());
      *     }
      * });
      */

     myNumber.numberProperty().addListener(new ChangeListener<Object>() {
         @Override
         public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
             pb.progressProperty().bind(myNumber.numberProperty());
             pi.progressProperty().bind(myNumber.numberProperty());
             lblStatus.setText(new Double(myNumber.getNumber()).toString());
         }
     });
    }

    public void btnClick(ActionEvent actionEvent) {
        myNumber.setNumber(myNumber.getNumber()+0.1);
    }


    public void btn2Click(ActionEvent actionEvent) {
        myNumber.setNumber(myNumber.getNumber()-0.1);

    }
}
