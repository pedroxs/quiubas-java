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
public class Mnp extends Base{
    
    /**
     * API Endpoint
     */
    private String base = "mnp";
    
    /**
     * Base object
     */
    private Base Base;
    
    /**
     * Mnp constructor
     * Calls the Base class and create an instance
     */
    public Mnp(){
        Base = new Base();
    }
    
    /**
     * get() let you get the MNP of a number. Returns a JSONObject.
     * Check the documentation for more info.
     * @param number
     * @return JSONObject Base.get()
     * @throws Exception 
     */
    public JSONObject get(String number) throws Exception{
        return Base.get(base + "/" + number);
    }
    
}
