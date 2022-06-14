
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> lista;

    public Stack() {
        this.lista = new ArrayList<>();
    }

    public boolean isEmpty() {
        return (this.lista.isEmpty());

    }

    public void add(String value) {
        this.lista.add(value);
    }

    public ArrayList<String> values() {
        return lista;
    }
    
    public String take(){
        String i = lista.get(this.lista.size()-1);
        this.lista.remove(i);
        
        return i;       
        
    }
}
