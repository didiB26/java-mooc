
import java.util.ArrayList;

public class OneItemBox extends Box {

    //private int counter;
    private ArrayList<String> oneBoxList;

    public OneItemBox() {
        //this.counter = 1; //1 item
        this.oneBoxList = new ArrayList<>();
    }

    public void add(Item item) {
        if (this.oneBoxList.size() < 1) {
            this.oneBoxList.add(item.getName());
        }

    }

    @Override
    public boolean isInBox(Item item) {
        for (String x : this.oneBoxList) {
            if (x.equals(item.getName())) {
                return true;
            }
        }

        return false;
    }

}
