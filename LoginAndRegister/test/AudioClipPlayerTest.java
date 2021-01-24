/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dylon
 */
public class AudioClipPlayerTest {

    private Clip [] clips;
    private boolean [] isPlaying;
    private AudioInputStream audioInputStream;
    private AudioClipPlayer audioClipPlayer;
    
    public AudioClipPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws UnsupportedAudioFileException, IOException {
     isPlaying = new boolean[30];
        clips = new Clip[30];
        audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource(MainPage.folder + "fx/fx-7.wav"));
        audioClipPlayer = new AudioClipPlayer(isPlaying, clips, audioInputStream);
     

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of startStop method, of class AudioClipPlayer.
     */
//    @Test
//    public void testStartStop() {
//        System.out.println("startStop");
//        int buttonNum = 0;
//        String fileLocation = "";
//        JButton jButton = null;
//        AudioClipPlayer instance = null;
//        instance.startStop(buttonNum, fileLocation, jButton);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of startClip method, of class AudioClipPlayer.
//     */
//    @Test
//    public void testStartClip() throws Exception {
//        System.out.println("startClip");
//        int x = 0;
//        AudioInputStream audioInputStream = null;
//        JButton jButton = null;
//        AudioClipPlayer instance = null;
//        instance.startClip(x, audioInputStream, jButton);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setVolume method, of class AudioClipPlayer.
     */
    @Test
    public void test_setVolume() throws LineUnavailableException, IOException {
            isPlaying[0] = true;
            clips[0] = AudioSystem.getClip();
            clips[0].open(audioInputStream);
            clips[0].start();
            audioClipPlayer.setVolumeOnSingleClip(0,85);
            FloatControl gainControl = (FloatControl) clips[0].getControl(FloatControl.Type.MASTER_GAIN);
            assertEquals(-2.6F, gainControl.getValue(), 0.01);
    }
    
        /**
     * Test of getVolumeValue method, of class AudioClipPlayer.
     */
    @Test
    public void test_getVolumeValue(){
        float result = audioClipPlayer.getVolumeValue(45);
        assertEquals(-37.0F, result, 0.01);
    }
    
}
