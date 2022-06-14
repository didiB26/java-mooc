
import java.util.HashMap;


public class Abbreviations {
    private HashMap<String, String> lista;
    
    public Abbreviations(){
        this.lista = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.lista.put(abbreviation, explanation);
                   
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.lista.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        String returnString;
        if (hasAbbreviation(abbreviation) == false){
            returnString = null;
        } else {
            returnString = this.lista.get(abbreviation);
        }
        
        return returnString;
    }
}
