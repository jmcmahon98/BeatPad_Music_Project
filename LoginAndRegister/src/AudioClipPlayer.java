
import java.awt.Color;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JButton;

/**
 *
 * @author dylon
 */
public class AudioClipPlayer {

    //Constructor
    public AudioClipPlayer(boolean[] isPlaying, Clip[] clips, AudioInputStream audioInputStream) {
        this.isPlaying = isPlaying;
        this.clips = clips;
        this.audioInputStream = audioInputStream;
    }
    
    private boolean [] isPlaying;
    private Clip [] clips;
    private AudioInputStream audioInputStream;
    
    
    //Checks if the clip is already playing, if not then starts clip, else stops clip
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
    
    //starts playing clip in a continuous loop
    public void startClip(int x, AudioInputStream audioInputStream, JButton jButton) throws LineUnavailableException, IOException{
                    jButton.setForeground(jButton.getBackground());
                    jButton.setOpaque(false);
                    clips[x] = AudioSystem.getClip();
                    clips[x].open(audioInputStream);
                    FloatControl gainControl = (FloatControl) clips[x].getControl(FloatControl.Type.MASTER_GAIN);
                    gainControl.setValue(getVolumeValue((MainPage.jSlider1).getValue()));
                    clips[x].start();
                    clips[x].loop(Clip.LOOP_CONTINUOUSLY);
                    isPlaying[x] = true;
                    
    }
    
    //stops clip
    private void stopClip(int x,JButton jButton){
                jButton.setOpaque(true);
                jButton.setForeground(Color.WHITE);
                this.clips[x].loop(0);
                this.clips[x].stop();
                this.clips[x].flush();
                isPlaying[x] = false;
    }
    
    //returns volume level(decibels) based on slider value 
    public static float getVolumeValue(int sliderVal){
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
    
    //sets volume for each clip 
    public void setVolume(int sliderVal){
            for (int i=0; i<clips.length; i++) {
            setVolumeOnSingleClip(i, sliderVal);
         }
    }

    //sets volume of a clip
    public void setVolumeOnSingleClip(int i, int sliderVal) {
        if(isPlaying[i]){
            FloatControl gainControl = (FloatControl) clips[i].getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(getVolumeValue(sliderVal));
            clips[i].start();
        }
    }
}
