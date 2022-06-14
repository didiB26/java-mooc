
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory ch = new ChangeHistory();

    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.addToWarehouse(initialBalance);
        //ch.add(initialBalance);
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        ch.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double returnVal = super.takeFromWarehouse(amount);
        ch.add(super.getBalance());
        return returnVal;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + ch.maxValue());
        System.out.println("Smallest amount of product: " + ch.minValue());
        System.out.println("Average: " + ch.average());
    }
    
    public String history() {
        return ch.toString();
    }
}
