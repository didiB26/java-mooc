
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> lista;

    public ShoppingCart() {
        lista = new ArrayList<>();
    }

    public void add(String product, int price) {
        Item tempItem = new Item(product, 1, price);
        if (lista.contains(tempItem)) {
            tempItem = lista.get(lista.indexOf(tempItem));
            tempItem.increaseQuantity();
        } else {
            lista.add(tempItem);
        }
    }


public int price() {
        int totalPrice = 0;
        for (Item x : this.lista) {
            totalPrice = totalPrice + x.price();
        }
        return totalPrice;
    }

    public void addToPrice() {

    }

    public void print() {
        for (Item x : this.lista) {
            System.out.println(x);
        }
    }

}
