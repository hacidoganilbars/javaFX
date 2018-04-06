package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;


public class Controller {
    @FXML
    private CheckBox cbDog;
    @FXML
    private CheckBox cbCat;
    @FXML
    private CheckBox cbCow;
    @FXML
    private CheckBox cbRabbit;
    @FXML
    private Label lblCount;
    @FXML
    private Label lblList;

    public void checkEvent(ActionEvent actionEvent){
        int count=0;
        String message="";
        if(cbDog.isSelected()){
            count++;
            message+=cbDog.getText()+"\n";
        } if(cbCat.isSelected()){
            count++;
            message+=cbCat.getText()+"\n";
        } if(cbCow.isSelected()){
            count++;
            message+=cbCow.getText()+"\n";
        } if(cbRabbit.isSelected()){
            count++;
            message+=cbRabbit.getText()+"\n";
        }
        lblCount.setText("Items selected: "+count);
        lblList.setText(message);
    }

}
