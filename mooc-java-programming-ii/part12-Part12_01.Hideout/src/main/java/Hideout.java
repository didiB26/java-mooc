
import java.util.ArrayList;


public class Hideout<T> {
    private ArrayList<T> param;
    
    public Hideout(){
        this.param = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide){
        if(!this.param.isEmpty()){
            this.param.removeAll(param);
        } 
        
        this.param.add(toHide);
    }
    
    public T takeFromHideout(){
        if(this.param.isEmpty()){
            return null;
        } 
        T parame = this.param.get(0);
        this.param.removeAll(param);
        return parame;
        
    }
    
    public boolean isInHideout(){
        if(!this.param.isEmpty()){
            return true;
        }
        
        return false;
    }
}
