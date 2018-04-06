package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {
    public Label lbl1;
    @FXML
    private RadioButton rbMale;
    @FXML
    private RadioButton rbFemale;
    @FXML
    private Label lbl;
    @FXML
    private ToggleGroup myGroup;

    String message="";

    public void radioSelect(ActionEvent event){

        if(rbMale.isSelected()){
            message+=rbMale.getText()+"\n";
        }if(rbFemale.isSelected()){
            message+=rbFemale.getText()+"\n";
        }
       // lbl.setText(message);


    }

    public void kayit(ActionEvent actionEvent) {
        lbl.setText(message);
    }

}
