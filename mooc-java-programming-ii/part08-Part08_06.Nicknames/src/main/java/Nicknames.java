
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        
        map.put("Matthew", "Matt");
        map.put("Michael","Mix");
        map.put("Arthur", "Artie");
        
        System.out.println(map.get("Matthew"));
    }

}
