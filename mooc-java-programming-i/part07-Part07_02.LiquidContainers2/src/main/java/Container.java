
public class Container {
    private String name;
    private int volume;
    
    public Container(){
        this.volume = 0;
    }
    
    public int contains(){
        return this.volume;
    }
    
    public void add(int amount){
        if (amount >= 0){
            if (amount + this.volume > 100){
                this.volume = 100;
            } else {
                this.volume = this.volume + amount;
            }
            
        }
    }
    
    
    public void remove(int amount){
        if (amount >= 0){
            if (amount >= this.volume){
                this.volume = 0;
            } else {
                this.volume = this.volume - amount;
            }
        }
    }
    
    public String toString(){
        return this.volume + "/100";
    }
}
