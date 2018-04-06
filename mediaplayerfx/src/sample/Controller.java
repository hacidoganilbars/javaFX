package sample;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{


    @FXML
    private MediaView mediaView;
    private  MediaPlayer mediaPlayer;
    private Media media;
    @FXML
    private Slider volumeSlider;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        String path=new File("src/media/NikosVertis.mp4").getAbsolutePath();
        media=new Media(new File(path).toURI().toString());
        mediaPlayer=new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
       // mediaPlayer.setAutoPlay(true);
        DoubleProperty width=mediaView.fitWidthProperty();
        DoubleProperty height=mediaView.fitHeightProperty();
        width.bind(Bindings.selectDouble(mediaView.sceneProperty(),"width"));
        height.bind(Bindings.selectDouble(mediaView.sceneProperty(),"height"));

        volumeSlider.setValue(mediaPlayer.getVolume()*100);
        volumeSlider.valueProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                mediaPlayer.setVolume(volumeSlider.getValue()/100);
            }
        });
    }

    public void play(ActionEvent actionEvent){
        mediaPlayer.play();
        mediaPlayer.setRate(1);
    }
    public void pause(ActionEvent actionEvent){
        mediaPlayer.pause();
    }
    public void fast(ActionEvent actionEvent){
        mediaPlayer.setRate(2);

    }
    public void slow(ActionEvent actionEvent){
        mediaPlayer.setRate(.5);
    }
    public void reload(ActionEvent actionEvent){
        mediaPlayer.seek(mediaPlayer.getStartTime());
        mediaPlayer.play();

    }
    public void start(ActionEvent actionEvent){
        mediaPlayer.seek(mediaPlayer.getStartTime());
        mediaPlayer.stop();

    }
    public void last(ActionEvent actionEvent){
        mediaPlayer.seek(mediaPlayer.getTotalDuration());
        mediaPlayer.stop();

    }
}
