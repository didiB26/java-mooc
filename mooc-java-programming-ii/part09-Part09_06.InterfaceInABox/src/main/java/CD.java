
public class CD implements Packable{

    private String artist;
    private String name;
    private double weight;
    private int year;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.weight = 0.1;
    }
    
    public String toString(){
        return this.artist + ": " + this.name + " (" + this.year + ")";
    }

    @Override
    public double weight() {
        return this.weight;

    }

}
