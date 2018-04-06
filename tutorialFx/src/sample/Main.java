package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.beans.EventHandler;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Button btn =new Button("Click me");
        Button exit=new Button("Exit");

        exit.setOnAction(event -> {
            System.out.println("Good Bye");
            System.exit(0);
        });

        btn.setOnAction(event -> System.out.println("Hello"));

        VBox vBox=new VBox();
        vBox.getChildren().addAll(btn,exit);
        Scene scene=new Scene(vBox,500,300);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
