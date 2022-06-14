
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> harta;
    private Map<String, Integer> hartaStock;

    public Warehouse() {
        this.harta = new HashMap<>();
        this.hartaStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.harta.put(product, price);
        this.hartaStock.put(product, stock);
    }

    public int price(String product) {
        if (!harta.containsKey(product)) {
            return -99;
        }
        return harta.get(product);
    }

    public int stock(String product) {
        if (!hartaStock.containsKey(product)) {
            return 0;
        }

        return hartaStock.get(product);
    }

    public boolean take(String product) {
        boolean returnVB = true;
        if (stock(product) == 0) {
            returnVB = false;
        } else if (stock(product) > 0) {
            int temp = hartaStock.get(product) - 1;

            hartaStock.remove(product);

            hartaStock.put(product, temp);
            returnVB = true;
        }
        return returnVB;
    }

    public Set<String> products() {
        Set<String> keys = harta.keySet();

        return keys;
    }

}
