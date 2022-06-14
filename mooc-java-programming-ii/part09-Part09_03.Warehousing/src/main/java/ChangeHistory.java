
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> lista;

    public ChangeHistory() {
        this.lista = new ArrayList<>();
    }

    public void add(double status) {
        this.lista.add(status);
    }

    public void clear() {
        this.lista.clear();
    }

    public double maxValue() {
        if (this.lista.isEmpty()) {
            return 0.0;
        }
        
        double max = this.lista.get(0);
        for (int i = 1; i<this.lista.size(); i++){
            if (max <this.lista.get(i)){
                max = this.lista.get(i);
            }
        }
        
        return max;       
    }

    public double minValue() {
        if (this.lista.isEmpty()) {
            return 0.0;
        }

        double min = this.lista.get(0);
        for (int i = 1; i<this.lista.size(); i++){
            if (min > this.lista.get(i)){
                min = this.lista.get(i);
            }
        }
        
        return min;  
    }

    public double average() {
        if (this.lista.isEmpty()) {
            return 0.0;
        } else {
            int sum = 0;
            int count = 0;
            double average;

            for (Double x : this.lista) {
                sum += x;
                count++;
            }
            average = 1.0 * sum / count;
            return average;
        }
    }

    @Override
    public String toString() {
        return this.lista.toString();
    }
}
