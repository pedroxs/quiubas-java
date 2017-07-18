/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asfo
 */
public class QuiubasIT {
    
    public QuiubasIT() {
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
     * Test of setAuth method, of class Quiubas.
     */
    @Test
    public void testSetAuth() {
        System.out.println("setAuth");
        String key = "";
        String secret = "";
        Quiubas instance = new Quiubas();
        instance.setAuth(key, secret);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuth method, of class Quiubas.
     */
    @Test
    public void testGetAuth() {
        System.out.println("getAuth");
        Quiubas instance = new Quiubas();
        Map<String, String> expResult = null;
        Map<String, String> result = instance.getAuth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBaseURL method, of class Quiubas.
     */
    @Test
    public void testSetBaseURL() {
        System.out.println("setBaseURL");
        String url = "";
        Quiubas instance = new Quiubas();
        instance.setBaseURL(url);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBaseURL method, of class Quiubas.
     */
    @Test
    public void testGetBaseURL() {
        System.out.println("getBaseURL");
        Quiubas instance = new Quiubas();
        String expResult = "";
        String result = instance.getBaseURL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVersion method, of class Quiubas.
     */
    @Test
    public void testSetVersion() {
        System.out.println("setVersion");
        String version = "";
        Quiubas instance = new Quiubas();
        instance.setVersion(version);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVersion method, of class Quiubas.
     */
    @Test
    public void testGetVersion() {
        System.out.println("getVersion");
        Quiubas instance = new Quiubas();
        String expResult = "";
        String result = instance.getVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLibraryVersion method, of class Quiubas.
     */
    @Test
    public void testGetLibraryVersion() {
        System.out.println("getLibraryVersion");
        Quiubas instance = new Quiubas();
        String expResult = "";
        String result = instance.getLibraryVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
