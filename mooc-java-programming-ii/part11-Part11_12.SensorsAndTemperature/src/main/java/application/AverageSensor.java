package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author didiBalasic
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> list;
    private List<Integer> lista;

    public AverageSensor() {
        this.list = new ArrayList<>();
        this.lista = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        list.add(toAdd);
    }

    @Override
    public boolean isOn() {
        boolean rasp = true;
        for (Sensor x : this.list) {
            if (x.isOn() == false) {
                rasp = false;
            }
        }
        return rasp;
    }

    @Override
    public void setOn() {
        for (Sensor x : this.list) {
            x.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor x : this.list) {
            x.setOff();
        }
    }

    @Override
    public int read() {
        int sum = 0;
        if (this.list.isEmpty() || !this.isOn()) {
            throw new IllegalStateException("Not good IllegalStateException");
        } else {
            for (Sensor x : this.list) {
                sum = sum + x.read();
            }
        }
        int average = sum / this.list.size(); 
        lista.add(average);
        return average;
    }

    public List<Integer> readings() {

        return lista;

    }
}
        
