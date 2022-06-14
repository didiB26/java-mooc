
public class Bird {

    private String name;
    private String nameLatin;
    private int counter;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.counter = 0;
    }
    
    public int counting(){
        this.counter++;
        return this.counter;
    }
    
    public String toString(){
        return this.name + " (" + this.nameLatin + "): " + this.getCounter() + " observations";
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCounter(){
        return this.counter;
    }
}
