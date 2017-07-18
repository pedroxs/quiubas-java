/**
 * Quiubass library
 * For full documentation go here: 
 * https://github.com/quiubas/quiubas-java
 * 
 * @version 1.0.0
 * @author  Quiubas Team
 */
import java.util.Map;
import org.json.JSONObject;

/**
 *
 * @author Quiubas Team
 */
public class Callback extends Base{
    
    /**
     * API Endpoint
     */
    private String base = "callback";
    
    /**
     * Base object
     */
    private Base Base;
    
    /**
     * Callback constructor
     * Calls the Base class and create an instance
     */
    public Callback(){
        Base = new Base();
    }
    
    /**
     * get() let you get the callback information. Returns a JSONObject.
     * Check the documentation for more info.
     * @return JSONObject Base.get()
     * @throws Exception 
     */
    public JSONObject get() throws Exception{
        return Base.get(base);
    }
    
    /**
     * update() let you update the callback
     * The parameters are optional but if you're going to update a callback
     * you should send at least 1 parameter. Check the documentation for more info.
     * @param params
     * @return JSONObject Base.update()
     * @throws Exception 
     */
    public JSONObject update(Map<String, String> params) throws Exception{
        return Base.update(base, params);
    }
    
}
