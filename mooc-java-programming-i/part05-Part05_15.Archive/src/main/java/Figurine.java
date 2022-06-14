
public class Figurine {

    private String name;
    private String identifier;

    public Figurine(String identity, String name) {

        this.identifier = identity;
        this.name = name;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Figurine)) {
            return false;
        }
        
        Figurine comparedF = (Figurine) compared;
        
        if(this.identifier.equals(comparedF.identifier)){
            return true;
        }

        return false;
    }

}
