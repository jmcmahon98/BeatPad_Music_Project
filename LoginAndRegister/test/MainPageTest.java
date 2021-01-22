/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.sound.sampled.AudioInputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.events.EventTarget;
import org.w3c.dom.views.AbstractView;

/**
 *
 * @author dylon
 */
public class MainPageTest {
    
    public MainPageTest() {
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
     * Test of startClip method, of class MainPage.
     */
    @Test
    public void testStartClip() throws Exception {
        System.out.println("startClip");
        int x = 0;
        AudioInputStream audioInputStream = null;
        MainPage instance = new MainPage();
        instance.startClip(x, audioInputStream);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MainPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainPage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class MainPage.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        MainPage instance = new MainPage();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScreenX method, of class MainPage.
     */
    @Test
    public void testGetScreenX() {
        System.out.println("getScreenX");
        MainPage instance = new MainPage();
        int expResult = 0;
        int result = instance.getScreenX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScreenY method, of class MainPage.
     */
    @Test
    public void testGetScreenY() {
        System.out.println("getScreenY");
        MainPage instance = new MainPage();
        int expResult = 0;
        int result = instance.getScreenY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientX method, of class MainPage.
     */
    @Test
    public void testGetClientX() {
        System.out.println("getClientX");
        MainPage instance = new MainPage();
        int expResult = 0;
        int result = instance.getClientX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientY method, of class MainPage.
     */
    @Test
    public void testGetClientY() {
        System.out.println("getClientY");
        MainPage instance = new MainPage();
        int expResult = 0;
        int result = instance.getClientY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCtrlKey method, of class MainPage.
     */
    @Test
    public void testGetCtrlKey() {
        System.out.println("getCtrlKey");
        MainPage instance = new MainPage();
        boolean expResult = false;
        boolean result = instance.getCtrlKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShiftKey method, of class MainPage.
     */
    @Test
    public void testGetShiftKey() {
        System.out.println("getShiftKey");
        MainPage instance = new MainPage();
        boolean expResult = false;
        boolean result = instance.getShiftKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltKey method, of class MainPage.
     */
    @Test
    public void testGetAltKey() {
        System.out.println("getAltKey");
        MainPage instance = new MainPage();
        boolean expResult = false;
        boolean result = instance.getAltKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMetaKey method, of class MainPage.
     */
    @Test
    public void testGetMetaKey() {
        System.out.println("getMetaKey");
        MainPage instance = new MainPage();
        boolean expResult = false;
        boolean result = instance.getMetaKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton method, of class MainPage.
     */
    @Test
    public void testGetButton() {
        System.out.println("getButton");
        MainPage instance = new MainPage();
        short expResult = 0;
        short result = instance.getButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRelatedTarget method, of class MainPage.
     */
    @Test
    public void testGetRelatedTarget() {
        System.out.println("getRelatedTarget");
        MainPage instance = new MainPage();
        EventTarget expResult = null;
        EventTarget result = instance.getRelatedTarget();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initMouseEvent method, of class MainPage.
     */
    @Test
    public void testInitMouseEvent() {
        System.out.println("initMouseEvent");
        String typeArg = "";
        boolean canBubbleArg = false;
        boolean cancelableArg = false;
        AbstractView viewArg = null;
        int detailArg = 0;
        int screenXArg = 0;
        int screenYArg = 0;
        int clientXArg = 0;
        int clientYArg = 0;
        boolean ctrlKeyArg = false;
        boolean altKeyArg = false;
        boolean shiftKeyArg = false;
        boolean metaKeyArg = false;
        short buttonArg = 0;
        EventTarget relatedTargetArg = null;
        MainPage instance = new MainPage();
        instance.initMouseEvent(typeArg, canBubbleArg, cancelableArg, viewArg, detailArg, screenXArg, screenYArg, clientXArg, clientYArg, ctrlKeyArg, altKeyArg, shiftKeyArg, metaKeyArg, buttonArg, relatedTargetArg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getView method, of class MainPage.
     */
    @Test
    public void testGetView() {
        System.out.println("getView");
        MainPage instance = new MainPage();
        AbstractView expResult = null;
        AbstractView result = instance.getView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetail method, of class MainPage.
     */
    @Test
    public void testGetDetail() {
        System.out.println("getDetail");
        MainPage instance = new MainPage();
        int expResult = 0;
        int result = instance.getDetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initUIEvent method, of class MainPage.
     */
    @Test
    public void testInitUIEvent() {
        System.out.println("initUIEvent");
        String typeArg = "";
        boolean canBubbleArg = false;
        boolean cancelableArg = false;
        AbstractView viewArg = null;
        int detailArg = 0;
        MainPage instance = new MainPage();
        instance.initUIEvent(typeArg, canBubbleArg, cancelableArg, viewArg, detailArg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class MainPage.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        MainPage instance = new MainPage();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarget method, of class MainPage.
     */
    @Test
    public void testGetTarget() {
        System.out.println("getTarget");
        MainPage instance = new MainPage();
        EventTarget expResult = null;
        EventTarget result = instance.getTarget();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTarget method, of class MainPage.
     */
    @Test
    public void testGetCurrentTarget() {
        System.out.println("getCurrentTarget");
        MainPage instance = new MainPage();
        EventTarget expResult = null;
        EventTarget result = instance.getCurrentTarget();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventPhase method, of class MainPage.
     */
    @Test
    public void testGetEventPhase() {
        System.out.println("getEventPhase");
        MainPage instance = new MainPage();
        short expResult = 0;
        short result = instance.getEventPhase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBubbles method, of class MainPage.
     */
    @Test
    public void testGetBubbles() {
        System.out.println("getBubbles");
        MainPage instance = new MainPage();
        boolean expResult = false;
        boolean result = instance.getBubbles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCancelable method, of class MainPage.
     */
    @Test
    public void testGetCancelable() {
        System.out.println("getCancelable");
        MainPage instance = new MainPage();
        boolean expResult = false;
        boolean result = instance.getCancelable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeStamp method, of class MainPage.
     */
    @Test
    public void testGetTimeStamp() {
        System.out.println("getTimeStamp");
        MainPage instance = new MainPage();
        long expResult = 0L;
        long result = instance.getTimeStamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopPropagation method, of class MainPage.
     */
    @Test
    public void testStopPropagation() {
        System.out.println("stopPropagation");
        MainPage instance = new MainPage();
        instance.stopPropagation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preventDefault method, of class MainPage.
     */
    @Test
    public void testPreventDefault() {
        System.out.println("preventDefault");
        MainPage instance = new MainPage();
        instance.preventDefault();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initEvent method, of class MainPage.
     */
    @Test
    public void testInitEvent() {
        System.out.println("initEvent");
        String eventTypeArg = "";
        boolean canBubbleArg = false;
        boolean cancelableArg = false;
        MainPage instance = new MainPage();
        instance.initEvent(eventTypeArg, canBubbleArg, cancelableArg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
