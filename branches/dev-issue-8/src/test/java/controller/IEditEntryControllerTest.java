/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PTsilopoulos
 */
public class IEditEntryControllerTest {
    
    public IEditEntryControllerTest() {
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
     * Test of getEntry method, of class IEditEntryController.
     */
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        IEditEntryController instance = new IEditEntryControllerImpl();
        String expResult = "";
        String result = instance.getEntry();
        assertEquals(expResult, result);
    }

    public class IEditEntryControllerImpl implements IEditEntryController {

        public String getEntry() {
            return "";
        }
    }
    
}
