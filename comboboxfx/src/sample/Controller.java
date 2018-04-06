package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable{
    @FXML
    private ListView <String> listView;
    @FXML
    private Label myLabel;
    @FXML
    private ComboBox <String> combobox;

    ObservableList<String> list= FXCollections.observableArrayList("Mustafa","Doğan","Emrah","Emine","Gözde");
    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       // combobox.setItems(list);
        listView.setItems(list);
        //ctrl + selected items
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    public void comboChanged(ActionEvent actionEvent) {
        combobox.getItems().addAll("Osman","Mahmut","Ayşe");
        //myLabel.setText(combobox.getValue());

    }

    public void buttonAction(ActionEvent actionEvent) {
       //listView.getItems().addAll("Osman","Mahmut","Ayşe");
        //myLabel.setText(combobox.getValue());
        ObservableList<String> names;
        names=listView.getSelectionModel().getSelectedItems();
        for (String name:names){
            System.out.println(name);
        }
    }
}
