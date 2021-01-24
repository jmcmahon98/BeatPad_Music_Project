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
public class RegisterFormTest {
    
    public RegisterFormTest() {
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
     * Test of main method, of class RegisterForm.
     */

    
    @Test
    public void test_checkRegisterFields_all_fields_empty(){
        RegisterForm regForm = new RegisterForm();
        boolean result = regForm.checkRegisterFields("", "", "", "");
        assertEquals(false, result);
    }
    
    @Test
    public void test_checkRegisterFields_different_passwords(){
        RegisterForm regForm = new RegisterForm();
        boolean result = regForm.checkRegisterFields("test", "test@gmail.com", "test123", "test321");
        assertEquals(false, result);
    }
    
    @Test
    public void test_checkRegisterFields_correct_input(){
        RegisterForm regForm = new RegisterForm();
        boolean result = regForm.checkRegisterFields("test", "test@gmail.com", "test123", "test123");
        assertEquals(true, result);
    }
    
}
