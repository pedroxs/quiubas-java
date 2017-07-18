package com.quiubas.api;

/**
 * Quiubass library
 * For full documentation go here: 
 * https://github.com/quiubas/quiubas-java
 * 
 * @version 1.0.0
 * @author  Quiubas Team
 */

import org.json.JSONObject;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Quiubas Team
 */
public class Sms extends Base{
    
    /**
     * API Endpoint
     */
    public static String base = "sms";
    /**
     * Base object
     */
    private Base Base;
    
    /**
     * Sms constructor
     * Calls the Base class and create an instance
     */
    public Sms(){
        Base = new Base();
    }
    
    /**
     * send() allows you to send a SMS using the to_number and message parameters
     * and returns the Base.action() JSONObject. Check the documentation for more info.
     * @param params
     * @return JSONObject Base.action()
     * @throws Exception 
     */
    public JSONObject send(Map<String, String> params) throws Exception{
        if(params.get("to_number") != null || params.get("message") != null){
            return Base.action(base, params);
        }else{
            throw new Exception("Error, 'to_number' and 'message' parameters are required");
        }
    }
    
    /**
     * get() gets the recent SMSs sent. Optional parameters are from_id, and
     * limit. Check the documentation for more info.
     * @param params
     * @return JSONObject Base.get()
     * @throws Exception 
     */
    public JSONObject get(Map<String, String> params) throws Exception{
        String url = "";
        if(params.get("from_id") != null){
            url += "from_id=" + params.get("from_id") + "&";
        }
        if(params.get("limit") != null){
            url += "limit=" + params.get("limit") + "&";
        }
        
        if(url.trim().length() > 0){
            url = "?" + url.substring(0, url.length() - 1);
            base = base + url;
        }
        
        return Base.get(base);
    }
    
    /**
     * An overload of the get() method so the parameter "params" is optional
     * @return JSONObject get()
     * @throws Exception 
     */
    public JSONObject get() throws Exception{
        return this.get(new HashMap<String, String>());
    }
    
    /**
     * getById() gets a specific SMS using the sms_id as parameter
     * @param id
     * @return JSONObject Base.get()
     * @throws Exception 
     */
    public JSONObject getById(String id) throws Exception{
        return Base.get(base + "/" + id);
    }
    
    /**
     * getResponses() gets the recent SMSs sent. Optional parameters are from_id, 
     * and limit. Check the documentation for more info.
     * @param id
     * @param params
     * @return JSONObject Base.get()
     * @throws Exception 
     */
    public JSONObject getResponses(String id, Map<String, String> params) throws Exception{
        String url = "";
        if(params.get("from_id") != null){
            url += "from_id=" + params.get("from_id") + "&";
        }
        if(params.get("limit") != null){
            url += "limit=" + params.get("limit") + "&";
        }
        
        if(url.trim().length() > 0){
            url = "?" + url.substring(0, url.length() - 1);
            base = base + "/" + id + "/responses" + url;
        }else{
            base = base + "/" + id + "/responses";
        }
        
        return Base.get(base);
    }
    
    /**
     * An overload of the get() method so the parameter "params" is optional
     * @param id
     * @return JSONObject get()
     * @throws Exception 
     */
    public JSONObject getResponses(String id) throws Exception{
        return this.getResponses(id, new HashMap<String, String>());
    }
    
}
