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
    
     /**
     * Tests of login method, of class LoginForm.
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
    
    
     /**
     * Tests of checkLoginFields method, of class LoginForm.
     */
        @Test
    public void test_checkLoginFields_username_field_empty(){
        LoginForm loginForm = new LoginForm();
        boolean result = loginForm.checkLoginFields("", "test");
        assertEquals(false, result);
    }
    @Test
    public void test_checkLoginFields_password_field_empty(){
        LoginForm loginForm = new LoginForm();
        boolean result = loginForm.checkLoginFields("test", "");
        assertEquals(false, result);
    }
    
    @Test
    public void test_checkLoginFields_correc_input(){
        LoginForm loginForm = new LoginForm();
        boolean result = loginForm.checkLoginFields("test", "test");
        assertEquals(true, result);
    }
    
}
