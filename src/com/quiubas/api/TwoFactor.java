package com.quiubas.api;

/**
 * Quiubass library
 * For full documentation go here: 
 * https://github.com/quiubas/quiubas-java
 * 
 * @version 1.4.0
 * @author  Quiubas Team
 */
import org.json.JSONObject;
import java.util.Map;

/**
 *
 * @author Quiubas Team
 */
public class TwoFactor {
    
    /**
     * API Endpoint
     */
    public static String base = "2fa";
    
    /**
     * Base object
     */
    private final Base Base;

    /**
     * TwoFactor constructor
     */
    public TwoFactor(){
        Base = new Base();
    }
    
    /**
     * create() calls Base.action() and returns a JSONObject based on the 
     * return. If doesn't have the required params, throws an Exception
     * @param params
     * @return JSONObject json
     * @throws Exception 
     */
    public JSONObject create(Map<String, String> params) throws Exception {
        if(params.get("type") != null) {
            if(Integer.parseInt(params.get("type")) == 0) {
                if(params.get("message") != null || params.get("number") != null) {
                    return Base.action(base, params);
                }else{
                    throw new Exception("Error, 'message' and 'number' parameters are required for type 0");
                }
            } else {
                if(params.get("subject") != null || params.get("from") != null || params.get("to") != null || params.get("message") != null){
                    return Base.action(base, params);
                }else{
                    throw new Exception("Error, 'subject', 'from', 'to' and 'message' parameters are required for type 1");
                }
            }
        } else {
            throw new Exception("Error, 'type' parameter is required");
        }
    }
    
    /**
     * update() calls Base.update() and returns a JSONObject based on the
     * return. If doesn't have the required params, throws an Exception
     * @param params
     * @return
     * @throws Exception 
     */
    public JSONObject update(Map<String, String> params) throws Exception {
        if(params.get("code") != null || params.get("id") != null){
            return Base.update(base, params);
        } else {
            throw new Exception("Error, 'code' and 'id' parameters are required");
        }
    }
    
}
