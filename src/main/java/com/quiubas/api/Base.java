package com.quiubas.api;

/**
 * Quiubass library
 * For full documentation go here: 
 * https://github.com/quiubas/quiubas-java
 * 
 * @version 1.4.1
 * @author  Quiubas Team
 */
import java.util.HashMap;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.Map;

/**
 *
 * @author Quiubas Team
 */
public class Base {
    
    /**
     * Network object
     */
    private Network Network;
    
    /**
     * Base constructor
     */
    public Base(){
        Network = new Network();
    }
    
    /**
     * action() calls Network.post() and returns a JSONObject based on the
     * return. If is not a valid JSONObject, throws an Exception
     * @param path
     * @param params
     * @return JSONObject json
     * @throws Exception 
     */
    public JSONObject action(String path, Map<String, String> params) throws Exception{
        String jsonString = Network.post(path, params);
        JSONObject json = new JSONObject(jsonString);
        return json;
    }
    
    /**
     * get() calls Network.get() and returns a JSONObject based on the
     * return. If is not a valid JSONObject, throws an Exception
     * @param path
     * @return JSONObject json
     * @throws Exception 
     */
    public JSONObject get(String path) throws Exception{
        String jsonString = Network.get(path);
        JSONObject json;
        try {
            json = new JSONObject(jsonString);   
        } catch(Exception e) {
            json = new JSONObject("{}");
        }
        return json;
    }
    
    public JSONArray getArray(String path) throws Exception {
        String jsonString = Network.get(path);
        JSONArray json;
        try {
            json = new JSONArray(jsonString);
        } catch(Exception e) {
            json = new JSONArray("[]");
        }
        return json;
    }
    
    /**
     * update() calls Network.put() and returns a JSONObject based on the
     * return. If is not a valid JSONObject, throws an Exception
     * @param path
     * @param params
     * @return JSONObject json
     * @throws Exception 
     */
    public JSONObject update(String path, Map<String, String> params) throws Exception{
        String jsonString = Network.put(path, params);
        JSONObject json = new JSONObject(jsonString);
        return json;
    }
    
    /**
     * update() Override the update() method for second param as not required
     * @param path
     * @return
     * @throws Exception 
     */
    public JSONObject update(String path) throws Exception {
        String jsonString = Network.put(path, new HashMap<String, String>());
        JSONObject json = new JSONObject(jsonString);
        return json;
    }
    
    /**
     * delete() calls Network.delete() and returns a JSONObject based on the
     * return. If is not a valid JSONObject, throws an Exception
     * @param path
     * @return JSONObject json
     * @throws Exception 
     */
    public JSONObject delete(String path) throws Exception{
        String jsonString = Network.delete(path);
        JSONObject json = new JSONObject(jsonString);
        return json;
    }
}
