/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class LoginFormTest {
    
    public LoginFormTest() {
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
     * Test of main method, of class LoginForm.
     */
    @Test
    public void test_login_with_existing_user() {
        LoginForm loginForm = new LoginForm();
        boolean result = loginForm.login("test", "test123");
        assertEquals(true, result);
    }
    
        @Test
    public void test_login_with_non_incorrect_user_credentials() {
        LoginForm loginForm = new LoginForm();
        boolean result = loginForm.login("test", "test");
        assertEquals(false, result);
    }
    
}
