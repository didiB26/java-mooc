
import java.util.ArrayList;


public class TodoList {
    private ArrayList<String> lista;
    
    public TodoList(){
        this.lista = new ArrayList<>();
    }
    
    public void add(String task){
        this.lista.add(task);
    }
    
    public void print(){
        for (int i = 1; i<=this.lista.size(); i++){
            System.out.println(i + ": " + this.lista.get(i-1));
        }
    }
    
    public void remove(int number){
        this.lista.remove(number - 1);
    }
}
