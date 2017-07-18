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

/**
 *
 * @author Quiubas Team
 */
public class Keywords extends Base{
    
    /**
     * API Endpoint
     */
    private String base = "keywords";
    
    /**
     * Base object
     */
    private Base Base;
    
    /**
     * Keywords constructor
     * Calls the Base class and create an instance
     */
    public Keywords(){
        Base = new Base();
    }
    
    /**
     * create() allows you to create keywords and return a JSONObject. 
     * Check the documentation for more info.
     * @param params
     * @return JSONObject Base.action()
     * @throws Exception 
     */
    public JSONObject create(Map<String, String> params) throws Exception{
        if(params.get("keyword") != null){
            return Base.action(base, params);
        }else{
            throw new Exception("Error, 'keyword' parameter is required");
        }
    }
    
    /**
     * get() let you get all the keywords that you stored in your account in a
     * JSONObject. Check the documentation for more info.
     * @return JSONObject Base.get()
     * @throws Exception 
     */
    public JSONObject get() throws Exception{
        return Base.get(base);
    }
    
    /**
     * getById() let you get a single keyword based on the ID
     * @param id
     * @return JSONObject Base.get()
     * @throws Exception 
     */
    public JSONObject getById(String id) throws Exception{
        return Base.get(base + "/" + id);
    }
    
    /**
     * update() let you update the keyword based on the keyword ID.
     * The parameters are optional but if you're going to update a keyword
     * you should send at least 1 parameter. Check the documentation for more info.
     * @param id
     * @param params
     * @return JSONObject Base.update()
     * @throws Exception 
     */
    public JSONObject update(String id, Map<String, String> params) throws Exception{
        return Base.update(base + "/" + id, params);
    }
    
    /**
     * delete() removes a keyword based on the keyword ID
     * @param id
     * @return JSONObject Base.delete()
     * @throws Exception 
     */
    public JSONObject delete(String id) throws Exception{
        return Base.delete(base + "/" + id);
   }
    
}
