
import java.util.ArrayList;
import java.util.Collections;


public class Hand implements Comparable<Hand>{
    
    private ArrayList<Card> mana;
    
    public Hand(){
        this.mana = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.mana.add(card);
    }
    
    public void print(){
        for (Card c : this.mana){
            System.out.println(c);
        }
    }
    
    public void sort(){
        Collections.sort(this.mana);
    }

    @Override
    public int compareTo(Hand hand2) {
        int sum1 = 0;
        int sum2 = 0;
        for(Card c : this.mana){
            sum1 = sum1 + c.getValue();// + c.getSuit().ordinal();
        }
        
        for(Card d : hand2.mana){
            sum2 = sum2 + d.getValue();// + d.getSuit().ordinal();
        }
        
        return sum1 - sum2;
    }
    
    public void sortBySuit(){
        BySuitInValueOrder x = new BySuitInValueOrder();
        Collections.sort(this.mana, x);
    }
    
}
