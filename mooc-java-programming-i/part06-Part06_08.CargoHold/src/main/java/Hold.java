
import java.util.ArrayList;


public class Hold {
    private ArrayList<Suitcase> stuff;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.stuff = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int sum = 0;
        for (Suitcase x : this.stuff){
            sum = sum + x.totalWeight();
        }
  
        if (suitcase.totalWeight() <= this.maxWeight - sum) {
            this.stuff.add(suitcase);
        }
    }
    
    @Override
    public String toString(){
        int sum = 0;
        for (Suitcase e : this.stuff){
            sum = sum + e.totalWeight();
        }
       
        return stuff.size() + " suitcases (" + sum + " kg)";
    }
    
    public void printItems(){
        for (Suitcase e : this.stuff){
            e.printItems();
        }
    }
    
    
}
