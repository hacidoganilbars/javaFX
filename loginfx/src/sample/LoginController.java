package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    public TextField txtUserName;
    @FXML
    public PasswordField txtPassword;
    @FXML
    public Label lblStatus;

    public void login(ActionEvent actionEvent) throws Exception{
        if(txtUserName.getText().equals("ayseilbars")&&txtPassword.getText().equals("1234")){
            lblStatus.setText("Login Sucess");
            Stage stage=new Stage();
            Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
            stage.setTitle("Sample Display");
            stage.setScene(new Scene(root,300,275));
            stage.show();
        }else{
            lblStatus.setText("Login Failed");
        }
    }
}
