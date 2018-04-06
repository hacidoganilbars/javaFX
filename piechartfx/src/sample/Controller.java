package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class Controller {
    @FXML
    private Label status;
    @FXML
    private PieChart pieChart;

    public void btn1(ActionEvent event) {
        ObservableList<PieChart.Data> list= FXCollections.observableArrayList(
                new PieChart.Data("Java",90),
                new PieChart.Data("C++",20),
                new PieChart.Data("Phyton",30),
                new PieChart.Data("C#",10),
                new PieChart.Data("C",15)
        );
        pieChart.setData(list);

        for(final PieChart.Data data : pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    status.setText(String.valueOf(data.getPieValue()+"%"));
                }
            });
        }
    }
}
