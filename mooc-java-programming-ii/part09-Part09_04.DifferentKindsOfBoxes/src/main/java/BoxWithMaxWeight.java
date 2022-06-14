
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<String> boxList;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.boxList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int testweight = this.capacity - item.getWeight();
        if (testweight >= 0) {
            this.capacity = testweight;
            this.boxList.add(item.getName());
            //System.out.println("adaug" + item.getName());
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (String x : this.boxList) {
            if (x.equals(item.getName())) {
                return true;
            }
        }

        return false;
    }

}
