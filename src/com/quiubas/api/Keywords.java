package com.quiubas.api;

/**
 * Quiubass library
 * For full documentation go here: 
 * https://github.com/quiubas/quiubas-java
 * 
 * @version 1.3.0
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
     * Secondary API Endpoint
     */
    private String secondaryBase = "keyword";
    
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
     * getById() let you get a single keyword based on the ID
     * @param id
     * @return JSONObject Base.get()
     * @throws Exception 
     */
    public JSONObject getById(String id) throws Exception{
        return Base.get(secondaryBase + "/" + id);
    }
    
    /**
     * update() let you update the keyword callback based on the
     * keyword ID.
     * @param id
     * @return JSONObject Base.update()
     * @throws Exception 
     */
    public JSONObject update(String id) throws Exception{
        return Base.update(secondaryBase + "/" + id);
    }
    
}
