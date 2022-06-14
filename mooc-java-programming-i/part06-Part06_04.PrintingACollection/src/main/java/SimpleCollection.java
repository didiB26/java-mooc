
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        int counter = this.elements.size();

        String chestie2 = "";
        String chestie = "";

        if (counter == 1) {
            chestie2 = "The collection " + this.name + " has " + counter + " element:";
            for (String elem : elements) {
                chestie = chestie + elem;
            }
        } else if (counter > 1) {
            chestie2 = "The collection " + this.name + " has " + counter + " elements:";
            for (String elem : elements) {
                chestie = chestie + elem + "\n";
            }
        }

        return chestie2 + "\n" + chestie;
    }

}
