
import java.util.ArrayList;

public class Box implements Packable{

    private double maxWeight;
    private ArrayList<Packable> items;

    public Box(double weight) {
        this.maxWeight = weight;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        double ww = this.maxWeight - item.weight();

        if (ww >= 0.0) {
            this.maxWeight = ww;
            items.add(item);
        }
    }

    public int noItems() {
        return items.size();
    }

    public double weight() {
        double sum = 0.0;
        for (Packable x : items) {
            sum = sum + x.weight();
        }
        return sum;

    }

    public String toString() {
        return "Box: " + this.noItems() + " items, total weight " + this.weight() + " kg";
    }
}
