package com.quiubas.api;

/**
 * Quiubass library
 * For full documentation go here: 
 * https://github.com/quiubas/quiubas-java
 * 
 * @version 1.2.0
 * @author  Quiubas Team
 */
import org.json.JSONObject;

/**
 *
 * @author Quiubas Team
 */
public class Balance extends Base{
    
    /**
     * API Endpoint
     */
    private String base = "balance";
    
    /**
     * Base object
     */
    private Base Base;
    
    /**
     * Balance constructor
     * Calls the Base class and create an instance
     */
    public Balance(){
        Base = new Base();
    }
    
    /**
     * get() let you get the balance of your account. Returns a JSONObject.
     * Check the documentation for more info.
     * @return JSONObject Base.get()
     * @throws Exception 
     */
    public JSONObject get() throws Exception{
        return Base.get(base);
    }
    
}
