
import java.util.Objects;


public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty = this.qty + 1;
    }
    
    public String toString(){
        return this.product + ": " + this.qty;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.product);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }
    
    
}
