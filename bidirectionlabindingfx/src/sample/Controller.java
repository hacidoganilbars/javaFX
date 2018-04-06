package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Slider slider;
    @FXML
    public TextField field;

    private static final double INIT_VALUE=50;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        slider.setValue(INIT_VALUE);
        field.setText(new Double(INIT_VALUE).toString());
        field.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance());

    }
}
