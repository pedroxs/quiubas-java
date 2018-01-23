package com.quiubas.api;

/**
 * Quiubass library
 * For full documentation go here: 
 * https://github.com/quiubas/quiubas-java
 * 
 * @version 1.3.1
 * @author  Quiubas Team
 */
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Quiubas Team
 */
public class Quiubas {
    
    /**
     * API Key
     */
    public static String API_KEY;

    /**
     * API Secret
     */
    public static String API_SECRET;

    /**
     * API Version
     */
    public static String API_VERSION = "1.0";

    /**
     * Library Version
     */
    public static String LIB_VERSION = "1.2.0";

    /**
     * Base URL
     */
    public static String BASE_URL = "https://api.quiubas.com";
    
    /**
     * setAuth() let you set the API_KEY and API_SECRET variables so 
     * the library use it for generate connections
     * @param String key
     * @param String secret 
     */
    public void setAuth(String key, String secret){
        this.API_KEY = key;
        this.API_SECRET = secret;
    }
    
    /**
     * getAuth() returns a map with the values from API_KEY and API_SECRET
     * with the keys in lowercase
     * @return Map auth
     */
    public Map<String, String> getAuth(){
        Map<String,String> auth = new HashMap<>();
        auth.put("api_key", this.API_KEY);
        auth.put("api_secret", this.API_SECRET);
        return auth;
    }
    
    /**
     * setBaseURL() let you change the BASE_URL variable
     * @param String url 
     */
    public void setBaseURL(String url){
        this.BASE_URL = url;
    }
    
    /**
     * getBaseURL() get the BASE_URL variable
     * @return String BASE_URL
     */
    public String getBaseURL(){
        return this.BASE_URL;
    }
    
    /**
     * getLibraryVersion() get the LIB_VERSION variable
     * @return String LIB_VERSION
     */
    public String getLibraryVersion(){
        return this.LIB_VERSION;
    }
}
