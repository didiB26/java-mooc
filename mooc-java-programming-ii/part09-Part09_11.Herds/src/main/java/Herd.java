
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Organism> lista;

    public Herd() {
        lista = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        lista.add((Organism) movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Organism x : lista){
            x.move(dx, dy);
        }

    }

    public String toString() {
        String t = "";
        for (Organism x : lista) {
            t = t + x + "\n";
        }
        return t;
    }

}
