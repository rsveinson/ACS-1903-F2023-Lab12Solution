/**
 * ACS-1903 Lab 11 Q8
 * @author (enter your name and student number)
 */
import java.util.ArrayList;

public class Lab12FoodDriver{
    public static void main(String[] args){ 
        Meal meal = new Meal();
        ArrayList<Food> menu = new ArrayList<>();
        meal.addFood(new Food("Burger", 500));
        meal.addFood(new Food("Fries", 300));
        meal.addFood(new Food("Salad", 140));
        meal.addFood(new Food("Cookie", 210));
        
    // add your code here
    
        System.out.println("Total calories: " + meal.getTotalCalories());
        
    }
}
