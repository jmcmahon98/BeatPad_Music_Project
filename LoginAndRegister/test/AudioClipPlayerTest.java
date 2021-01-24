/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.sound.sampled.AudioInputStream;
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
    
    public AudioClipPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of startStop method, of class AudioClipPlayer.
     */
    @Test
    public void testStartStop() {
        System.out.println("startStop");
        int buttonNum = 0;
        String fileLocation = "";
        JButton jButton = null;
        AudioClipPlayer instance = null;
        instance.startStop(buttonNum, fileLocation, jButton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startClip method, of class AudioClipPlayer.
     */
    @Test
    public void testStartClip() throws Exception {
        System.out.println("startClip");
        int x = 0;
        AudioInputStream audioInputStream = null;
        JButton jButton = null;
        AudioClipPlayer instance = null;
        instance.startClip(x, audioInputStream, jButton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVolume method, of class AudioClipPlayer.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        AudioClipPlayer instance = null;
        instance.setVolume();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
