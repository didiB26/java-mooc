
import java.util.ArrayList;
import java.util.List;


public class Recipe {
    private String name;
    private int time;
    private List<String> ingredients;
    
    public Recipe (String name, int time, List<String> ingredients){
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
        
    }
    
    
    
    public String toString(){
        return this.getName() + ", cooking time: " + this.getTime();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the ingredients
     */
    public List<String> getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
