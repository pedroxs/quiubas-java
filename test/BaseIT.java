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
public class BaseIT {
    
    public BaseIT() {
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
     * Test of action method, of class Base.
     */
    @Test
    public void testAction() throws Exception {
        System.out.println("action");
        String path = "";
        Map<String, String> params = null;
        Base instance = new Base();
        JSONObject expResult = null;
        JSONObject result = instance.action(path, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Base.
     */
    @Test
    public void testGet() throws Exception {
        System.out.println("get");
        String path = "";
        Base instance = new Base();
        JSONObject expResult = null;
        JSONObject result = instance.get(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Base.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        String path = "";
        Map<String, String> params = null;
        Base instance = new Base();
        JSONObject expResult = null;
        JSONObject result = instance.update(path, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Base.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        String path = "";
        Map<String, String> params = null;
        Base instance = new Base();
        JSONObject expResult = null;
        JSONObject result = instance.delete(path, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
