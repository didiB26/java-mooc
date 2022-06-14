
import java.util.HashMap;


public class IOU {
    
    private HashMap<String, Double> lista;
    
    public IOU(){
        this.lista = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.lista.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        double forReturn = 0.0;
        for (String x : this.lista.keySet() ){
            if (x.contains(toWhom)){
                forReturn = this.lista.get(x);
            }
        }
        
        return forReturn;
    }
    
}
