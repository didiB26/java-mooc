
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> cuv;

    public DictionaryOfManyTranslations() {
        this.cuv = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.cuv.putIfAbsent(word, new ArrayList<String>());
        cuv.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> temp = new ArrayList<>();
        if (cuv.containsKey(word)){
            temp = cuv.get(word);
        }
        return temp;
    }
    
    public void remove(String word){
        this.cuv.remove(word);
    }
}
