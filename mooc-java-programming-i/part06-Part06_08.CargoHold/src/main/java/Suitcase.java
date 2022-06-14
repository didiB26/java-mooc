
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int sum = 0;
        for (Item x : items){
            sum = sum + x.getWeight();
        }
  
        if (item.getWeight() <= this.maxWeight - sum) {
            this.items.add(item);
        }
    }

    public String toString() {
        int numar = this.items.size();
        int kile = 0;

        for (Item x : items) {
            kile = kile + x.getWeight();
        }
        String gol = "";
        if (numar == 0){
            gol = "no items (" + kile + " kg)";
        } else if (numar == 1){
            gol = numar + " item (" + kile + " kg)";
        } else {
            gol = numar + " items (" + kile + " kg)";
        }

        return gol;

    }
    
    public void printItems(){
        for (Item x : items){
            System.out.println(x);
        }
    }
    
    public int totalWeight(){
        int kile = 0;

        for (Item x : items) {
            kile = kile + x.getWeight();
        }
        
        return kile;
    }
    
    public Item heaviestItem(){
        if (this.items.isEmpty()){
            return null;
        }
        
        Item init = this.items.get(0);
        
        for (Item x : items){
            if (init.getWeight() < x.getWeight()){
                init = x;
            }
        }
        
        return init;
    }
}
