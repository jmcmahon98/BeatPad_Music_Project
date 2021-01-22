
import java.awt.Color;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dylon
 */
public class AudioClipPlayer {

    public AudioClipPlayer(boolean[] isPlaying, Clip[] clips, AudioInputStream audioInputStream) {
        this.isPlaying = isPlaying;
        this.clips = clips;
        this.audioInputStream = audioInputStream;
    }
    
    private boolean [] isPlaying;
    private Clip [] clips;
    private AudioInputStream audioInputStream;
    
    public void startStop(int buttonNum, String fileLocation, JButton jButton){
        try {
             if(!isPlaying[buttonNum]){
                    audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource(MainPage.folder + fileLocation));
                    startClip(buttonNum, audioInputStream, jButton);

            }else{
                 stopClip(buttonNum, jButton);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
            public void startClip(int x, AudioInputStream audioInputStream, JButton jButton) throws LineUnavailableException, IOException{
                    clips[x] = AudioSystem.getClip();
                    jButton.setForeground(jButton.getBackground());
                    jButton.setOpaque(false);
                    clips[x].open(audioInputStream);
                    FloatControl gainControl = (FloatControl) clips[x].getControl(FloatControl.Type.MASTER_GAIN);
                    gainControl.setValue(getVolume((MainPage.jSlider1).getValue()));
                    clips[x].start();
                    clips[x].loop(Clip.LOOP_CONTINUOUSLY);
                    isPlaying[x] = true;
                    
    }
    
    private void stopClip(int x,JButton jButton){
                            jButton.setOpaque(true);
                    jButton.setForeground(Color.WHITE);
                        this.clips[x].loop(0);
                this.clips[x].stop();
                this.clips[x].flush();
                isPlaying[x] = false;
    }
    private float getVolume(int sliderVal){
        if(sliderVal<1){
            return -80.0F;
        }else if(sliderVal<=10){
            return -71.4F;
        }else if(sliderVal>10 && sliderVal<=20){
            return -62.8F;
        }else if(sliderVal>20 && sliderVal<=30){
            return -54.2F;
        }else if(sliderVal>30 && sliderVal<=40){
            return -45.6F;
        }else if(sliderVal>40 && sliderVal<=50){
            return -37.0F;
        }else if(sliderVal>50 && sliderVal<=60){
            return -28.4F;
        }else if(sliderVal>60 && sliderVal<=70){
            return -19.8F;
        }else if(sliderVal>70 && sliderVal<=80){
            return -11.2F;
        }else if(sliderVal>80 && sliderVal<=90){
            return -2.6F;
        }else{
            return 6.0F;
        }
        
    }
    
    public void setVolume(){
                 for (int i=0; i<clips.length; i++) {
             if(isPlaying[i]){
             FloatControl gainControl = (FloatControl) clips[i].getControl(FloatControl.Type.MASTER_GAIN);
             gainControl.setValue(getVolume(MainPage.jSlider1.getValue())); // Reduce volume by 10 decibels.
             clips[i].start();
             }
         }
    }
}
