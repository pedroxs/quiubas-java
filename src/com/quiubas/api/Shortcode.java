package com.quiubas.api;

/**
 * Quiubass library
 * For full documentation go here: 
 * https://github.com/quiubas/quiubas-java
 * 
 * @version 1.3.1
 * @author  Quiubas Team
 */
import java.util.HashMap;
import org.json.JSONObject;
import org.json.JSONArray;

/**
 * 
 * @author Quiubas Team
 */
public class Shortcode {
    
    /**
     * API Endpoint
     */
    public static String base = "shortcode";
    
    /**
     * Secondary API Endpoint
     */
    public static String secondaryBase = "shortcodes";
    
    /**
     * Base object
     */
    private final Base Base;
    
    /**
     * Shortcode constructor
     */
    public Shortcode() {
        Base = new Base();
    }
    
    /**
     * get() Get the shortcode list
     * @return
     * @throws Exception 
     */
    public JSONObject get() throws Exception {
        return Base.get(secondaryBase);
    }
    
    /**
     * getById() Gets the shortcode using an ID (override the main get())
     * @param id
     * @return
     * @throws Exception 
     */
    public JSONObject getById(String id) throws Exception {
        return Base.get(base + "/" + id);
    }
    
    /**
     * getResponses() gets the response of a shortcode
     * @param id
     * @return
     * @throws Exception 
     */
    public JSONArray getResponses(String id) throws Exception {
        return Base.getArray(base + "/" + id + "/responses");
    }
    
    /**
     * update() Updates the shortcode id callback
     * @param id
     * @return
     * @throws Exception 
     */
    public JSONObject update(String id) throws Exception {
        return Base.update(base);
    }
}
