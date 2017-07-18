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
public class NetworkIT {
    
    public NetworkIT() {
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
     * Test of get method, of class Network.
     */
    @Test
    public void testGet() throws Exception {
        System.out.println("get");
        String path = "";
        Network instance = new Network();
        String expResult = "";
        String result = instance.get(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of post method, of class Network.
     */
    @Test
    public void testPost() throws Exception {
        System.out.println("post");
        String path = "";
        Map<String, String> params = null;
        Network instance = new Network();
        String expResult = "";
        String result = instance.post(path, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Network.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        String path = "";
        Map<String, String> params = null;
        Network instance = new Network();
        String expResult = "";
        String result = instance.delete(path, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class Network.
     */
    @Test
    public void testPut() throws Exception {
        System.out.println("put");
        String path = "";
        Map<String, String> params = null;
        Network instance = new Network();
        String expResult = "";
        String result = instance.put(path, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of request method, of class Network.
     */
    @Test
    public void testRequest() {
        System.out.println("request");
        String path = "";
        Map<String, String> params = null;
        String method = "";
        Network instance = new Network();
        String expResult = "";
        String result = instance.request(path, params, method);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
