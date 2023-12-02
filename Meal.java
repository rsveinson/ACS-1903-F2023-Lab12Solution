import java.util.ArrayList;

/**
 * ACS-1903 Lab 11 Q7
 * @author (enter your name and student number)
 */
public class Meal{
    // fields
    private ArrayList<Food> foodItems;

    // constructors
    public Meal(){
        foodItems = new ArrayList<Food>();
    }
     
    public void addFood(Food f){
        foodItems.add(f);
    }
    
    // Lab 12 Q6
    public int getTotalCalories(){
        int tc = 0;
        
        for(Food f : foodItems){
            tc += f.getCalories();
        }
        
        return tc;
    }

   

    
    
}
