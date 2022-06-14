
public class Gift {
    private String name;
    private int weight;
    
    public Gift(String nume, int gr){
        this.name = nume;
        this.weight = gr;
    }
    
    public String getName(){
        return this.name;
    }

    public int getWeight() {
        return weight;
    }
    
    public String toString(){
        return this.getName() + "(" + this.getWeight() + " kg)";
    }
    
    
}
