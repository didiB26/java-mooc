
import java.util.ArrayList;


public class Pipe<T> {
    private ArrayList<T> param;
    
    public Pipe(){
        this.param = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.param.add(value);
    }
    
    public T takeFromPipe(){
        if (this.param.isEmpty()){
            return null;
        }
        
        T param = this.param.get(0);
        this.param.remove(0);
        return param;
        
    }
    
    public boolean isInPipe(){
        if (this.param.isEmpty()){
            return false;
        }
        
        return true;
    }
}
