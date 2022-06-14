
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> map;

    public VehicleRegistry() {
        this.map = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!map.containsKey(licensePlate)) {
            map.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (this.map.containsKey(licensePlate)) {
            return this.map.get(licensePlate);
        } else {
            return null;
        }

    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.map.containsKey(licensePlate)) {
            this.map.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate x : this.map.keySet()) {
            System.out.println(x);
        }
    }

    public void printOwners() {
        ArrayList<String> ow = new ArrayList<>();
        for (String y : this.map.values()) {
            if (!ow.contains(y)) {
                ow.add(y);
            }
        }
        for (String x : ow) {
            System.out.println(x);
        }

    }
}
