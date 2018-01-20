package com.quiubas.api;

/**
 * Quiubass library
 * For full documentation go here: 
 * https://github.com/quiubas/quiubas-java
 * 
 * @version 1.3.0
 * @author  Quiubas Team
 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.HashMap;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Quiubas Team
 */
public class Network {
    
    /**
     * Emulates Mozilla User Agent
     */
    private String USER_AGENT = "Quiubas-Java";
    /**
     * To store original API_KEY
     */
    private final String API_KEY;
    /**
     * To store original API_SECRET
     */
    private final String API_SECRET;
    
    /**
     * Network constructor.
     * Sets the API_KEY and API_SECRET from the Qiubas class
     * which is used to set the authentification for the API server. Also
     * sets the USER_AGENT 
     */
    public Network(){
        this.API_KEY = Quiubas.API_KEY;
        this.API_SECRET = Quiubas.API_SECRET;
        this.USER_AGENT = this.USER_AGENT + "/" + Quiubas.API_VERSION;
    }
    
    /**
     * get() function used to get data from the API using the GET verb.
     * @param path
     * @return String Network.request()
     * @throws Exception 
     */
    public String get(String path) throws Exception {
        return this.request(path, new HashMap<String, String>(), "GET");
    }
    
    /**
     * post() function used to post data to the API using the POST verb.
     * @param path
     * @param params
     * @return String Network.request()
     * @throws Exception 
     */
    public String post(String path, Map<String, String> params) throws Exception {
        return this.request(path, params, "POST");
    }
    
    /**
     * delete() function used to remove data from the API using the DELETE verb
     * @param path
     * @return String Network.request()
     * @throws Exception 
     */
    public String delete(String path) throws Exception {
        return this.request(path, new HashMap<String, String>(), "DELETE");
    }
    
    /**
     * put() function used to post|get(put) data from the API using the PUT verb
     * @param path
     * @param params
     * @return String Network.request()
     * @throws Exception 
     */
    public String put(String path, Map<String, String> params) throws Exception {
        return this.request(path, params, "PUT");
    }
    
    /**
     * request() function used to post/put/get/delete data from the API
     * and returns the result as a JSON String (not JSONObject). 
     * @param path
     * @param params
     * @param method
     * @return String
     */
    public String request(String path, Map<String, String> params, String method){
        String fullUrl = Quiubas.BASE_URL + "/" + URLEncoder.encode(path).replace("%2F", "/");
        Base64 base64 = new Base64();
        String encoded = base64.encodeAsString((this.API_KEY + ":" + this.API_SECRET).getBytes());
        try{
            URL url = new URL(fullUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            
            con.setRequestProperty("User-Agent", this.USER_AGENT);
            con.setDoOutput(true);
            con.setRequestProperty("Authorization", "Basic " + encoded);
            
            switch(method){
                case "POST":
                    con.setRequestMethod("POST");
                    DataOutputStream writePost = new DataOutputStream(con.getOutputStream());
                    
                    String urlParamsPost = "";
                    for(Map.Entry<String, String> entry : params.entrySet()){
                        urlParamsPost += entry.getKey() + "=" + URLEncoder.encode(entry.getValue(), "UTF-8") + "&";
                    }
                    urlParamsPost = urlParamsPost.substring(0, urlParamsPost.length() - 1);
                    writePost.writeBytes(urlParamsPost);
                    writePost.flush();
                    writePost.close();
                    
                break;
                case "GET":
                    con.setRequestMethod("GET");
                break;
                case "PUT":
                    con.setRequestMethod("PUT");
                    DataOutputStream writePut = new DataOutputStream(con.getOutputStream());
                    
                    String urlParamsPut = "";
                    for(Map.Entry<String, String> entry : params.entrySet()){
                        urlParamsPut += entry.getKey() + "=" + URLEncoder.encode(entry.getValue(), "UTF-8") + "&";
                    }
                    if(urlParamsPut.trim().length() > 0){
                        urlParamsPut = urlParamsPut.substring(0, urlParamsPut.length() - 1);
                        writePut.writeBytes(urlParamsPut);
                        writePut.flush();
                        writePut.close();
                    }
                break;
                case "DELETE":
                    con.setRequestMethod("DELETE");
                break;
                default:
                    throw new Exception("Error in Network.request parameters. Parameter 'method' is not set correctly");
            }
            
            int responseCode = con.getResponseCode();
            if(responseCode != 200 && responseCode != 201 && responseCode != 202){
                throw new Exception("Error in response. Response code: " + responseCode);
            }else{
                StringBuilder response;
                try{ 
                    BufferedReader input = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String line;
                    response = new StringBuilder();
                    while((line = input.readLine()) != null){
                        response.append(line);
                    }
                    return response.toString();
                }catch(Exception e){
                    return e.getMessage();
                }
                
            }
        }catch(Exception e){
            return e.getMessage();
        }
    }
}
