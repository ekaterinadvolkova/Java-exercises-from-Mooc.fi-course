
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){
        if(!this.meals.contains(meal)){
            this.meals.add(meal); 
        }
    }
    
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Menu, the objects are not equal
        if (!(compared instanceof Menu)) {
            return false;
        }

        // convert the object to a Menu object
        Menu comparedMenu = (Menu) compared;

        // if the values of the object variables are equal, the objects are, too
        return (this.meals.equals(comparedMenu.meals) );
    }
    
    public void printMeals(){
        for(int i=0;i<meals.size();i++){
            System.out.println(meals.get(i));
        }
        
    }
    
    public void clearMenu() {
        meals.clear();
        
    }
    
}
