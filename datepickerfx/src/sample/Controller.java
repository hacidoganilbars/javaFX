package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class Controller {
    @FXML
    private DatePicker datePicker;
    @FXML
    private Label lblShowDate;

    public void showDate(ActionEvent event) {
        LocalDate localDate=datePicker.getValue();
        lblShowDate.setText(localDate.toString());
    }

}
