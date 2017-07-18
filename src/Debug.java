import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Asfo
 */
public class Debug {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Quiubas Quiubas = new Quiubas();
        Quiubas.setAuth("b444ac8f67752e15140b262159e095de2878801c", "bbe6a9af1b8248123d688cbcc6d2c5a157b26507");
        Callback Callback = new Callback();
        try{
            System.out.println(Callback.get());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
