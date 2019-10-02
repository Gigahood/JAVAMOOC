
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String , String> numbers = new HashMap<String, String>();
        numbers.put("matti","mage");
        numbers.put("mikael", "mixu");
        numbers.put("arto", "arppa");
        
        System.out.println(numbers.get("mikael"));
    }

}
