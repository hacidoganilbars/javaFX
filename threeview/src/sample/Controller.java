package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private TreeView <String> treeView;

    Image folderIcon=new Image(getClass().getResourceAsStream("/img/folder.png"));



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

        TreeItem<String> root=new TreeItem<>("Root",new ImageView(folderIcon));
        root.setExpanded(true);

        TreeItem<String> nodeA=new TreeItem<>("Node A",new ImageView(folderIcon));
        TreeItem<String> nodeB=new TreeItem<>("Node B",new ImageView(folderIcon));
        TreeItem<String> nodeC=new TreeItem<>("Node C",new ImageView(folderIcon));
        root.getChildren().add(nodeA);
        root.getChildren().add(nodeB);
        root.getChildren().add(nodeC);
        //root.getChildren().addAll(nodeA,nodeB,nodeC);
        nodeA.setExpanded(true);

        TreeItem<String> nodeA1=new TreeItem<>("Node A 1",new ImageView(folderIcon));
        TreeItem<String> nodeB1=new TreeItem<>("Node B 1",new ImageView(folderIcon));
        TreeItem<String> nodeC1=new TreeItem<>("Node C 1",new ImageView(folderIcon));
        nodeA.getChildren().addAll(nodeA1,nodeB1,nodeC1);

        treeView.setRoot(root);

    }


    public void mouseClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount()==2){
            TreeItem<String> item=treeView.getSelectionModel().getSelectedItem();
            System.out.println(item.getValue());
        }

    }
}
