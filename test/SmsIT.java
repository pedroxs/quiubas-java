/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Map;
import org.json.JSONObject;
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
public class SmsIT {
    
    public SmsIT() {
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
     * Test of send method, of class Sms.
     */
    @Test
    public void testSend() throws Exception {
        System.out.println("send");
        Map<String, String> params = null;
        Sms instance = new Sms();
        JSONObject expResult = null;
        JSONObject result = instance.send(params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Sms.
     */
    @Test
    public void testGet_Map() throws Exception {
        System.out.println("get");
        Map<String, String> params = null;
        Sms instance = new Sms();
        JSONObject expResult = null;
        JSONObject result = instance.get(params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Sms.
     */
    @Test
    public void testGet_0args() throws Exception {
        System.out.println("get");
        Sms instance = new Sms();
        JSONObject expResult = null;
        JSONObject result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class Sms.
     */
    @Test
    public void testGetById() throws Exception {
        System.out.println("getById");
        String id = "";
        Sms instance = new Sms();
        JSONObject expResult = null;
        JSONObject result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResponses method, of class Sms.
     */
    @Test
    public void testGetResponses_String_Map() throws Exception {
        System.out.println("getResponses");
        String id = "";
        Map<String, String> params = null;
        Sms instance = new Sms();
        JSONObject expResult = null;
        JSONObject result = instance.getResponses(id, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResponses method, of class Sms.
     */
    @Test
    public void testGetResponses_String() throws Exception {
        System.out.println("getResponses");
        String id = "";
        Sms instance = new Sms();
        JSONObject expResult = null;
        JSONObject result = instance.getResponses(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
