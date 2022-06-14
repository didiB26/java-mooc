
import java.util.ArrayList;

public class MisplacingBox extends Box {

    //private int counter;
    private ArrayList<String> mBoxList;

    public MisplacingBox() {
        //this.counter = 1; //1 item
        this.mBoxList = new ArrayList<>();
    }

    public void add(Item item) {

        this.mBoxList.add(item.getName());

    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

}
