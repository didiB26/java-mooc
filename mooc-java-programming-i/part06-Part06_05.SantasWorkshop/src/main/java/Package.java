
import java.util.ArrayList;


public class Package {
    
    private ArrayList<Gift> gifts;
    
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    
    public int totalWeight(){
        //return -1;
        int sum = 0;
        
        for(Gift x : gifts){
            sum = sum + x.getWeight();
        }
               
        return sum;
    }
}
