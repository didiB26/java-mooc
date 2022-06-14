
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> map;

    public StorageFacility() {
        this.map = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.map.putIfAbsent(unit, new ArrayList<String>());
        this.map.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> lista = new ArrayList<>();

        if (this.map.containsKey(storageUnit)) {
            lista = this.map.get(storageUnit);
        }

        return lista;
    }

    public void remove(String storageUnit, String item) {
        contents(storageUnit).remove(item);

        if (contents(storageUnit).isEmpty()) {
            this.map.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> newarr = new ArrayList<>();
        
        for (String x : this.map.keySet()){
            if (!contents(x).isEmpty()){
                newarr.add(x);
            }
        }
        
        return newarr;
        
    }
}
