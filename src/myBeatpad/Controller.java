package myBeatpad;


import javafx.event.ActionEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Controller {

    boolean [] isPlaying;
    AudioInputStream audioInputStream = null;
    Clip [] clips;

    public Controller() {
        this.clips = new Clip[18];
        this.isPlaying = new boolean[18];
    }

    public void startClip(int x, AudioInputStream audioInputStream) throws LineUnavailableException, IOException{
        clips[x] = AudioSystem.getClip();
        clips[x].open(audioInputStream);
        FloatControl gainControl = (FloatControl) clips[x].getControl(FloatControl.Type.MASTER_GAIN);
//        gainControl.setValue(getVolume(jSlider1.getValue()));
        clips[x].start();
        clips[x].loop(Clip.LOOP_CONTINUOUSLY);
        isPlaying[x] = true;
    }

    public void stopClip(int x){
        this.clips[x].loop(0);
        this.clips[x].stop();
        this.clips[x].flush();
        isPlaying[x] = false;
    }

    public void button00(ActionEvent actionEvent) throws IOException, UnsupportedAudioFileException, LineUnavailableException {

    }

    public void button01(ActionEvent actionEvent) {
    }

    public void button02(ActionEvent actionEvent) {
    }

    public void button03(ActionEvent actionEvent) {
    }

    public void button10(ActionEvent actionEvent) {
    }

    public void button11(ActionEvent actionEvent) {
    }

    public void button12(ActionEvent actionEvent) {
    }

    public void button13(ActionEvent actionEvent) {
    }

    public void button20(ActionEvent actionEvent) {
    }

    public void button21(ActionEvent actionEvent) {
    }

    public void button22(ActionEvent actionEvent) {
    }

    public void button23(ActionEvent actionEvent) {
    }
}
