package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;


public class Controller {
    @FXML
    private Label lbl;
    @FXML
    private LineChart<String,Number> lineChart;

    public void btnLoadChart(ActionEvent event) {
        lineChart.getData().clear();
        XYChart.Series<String,Number> series=new XYChart.Series<String, Number>();
        series.getData().add(new XYChart.Data<String, Number>("Ocak",200));
        series.getData().add(new XYChart.Data<String, Number>("Şubat",500));
        series.getData().add(new XYChart.Data<String, Number>("Mart",300));
        series.getData().add(new XYChart.Data<String, Number>("Nisan",600));
        series.setName("Month Pay");
        lineChart.getData().add(series);

        for(final XYChart.Data<String, Number> data:series.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    lbl.setText("X :"+data.getXValue()+"\nY :"+String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(),new Tooltip("X :"+data.getXValue()+"\nY :"+String.valueOf(data.getYValue())));


                }
            });

        }

    }
}
