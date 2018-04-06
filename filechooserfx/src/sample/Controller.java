package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;

import java.io.File;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.List;

public class Controller {
    @FXML
    private ListView  listView;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;

    //one
    public void btn1Action(ActionEvent actionEvent) {
        FileChooser fc=new FileChooser();
        fc.setInitialDirectory(new File("C:\\Users\\HP\\Downloads"));
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PDF File","*.pdf"));
        File selectedFile=fc.showOpenDialog(null);
        if(selectedFile!=null){
            listView.getItems().add(selectedFile.getName());
            listView.getItems().add(selectedFile.getAbsolutePath());
        }else{
            System.out.println("File is not valid");
        }
    }

    //multi
    public void btn2Action(ActionEvent actionEvent) {
        FileChooser fc=new FileChooser();
        fc.setInitialDirectory(new File("C:\\Users\\HP\\Downloads"));
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PDF File","*.pdf"));
        List<File> selectedFiles=fc.showOpenMultipleDialog(null);
        if(selectedFiles!=null){
            for (int i = 0; i <selectedFiles.size() ; i++) {
                listView.getItems().add(selectedFiles.get(i).getAbsolutePath());
            }

        }else{
            System.out.println("File is not valid");
        }
    }
}
