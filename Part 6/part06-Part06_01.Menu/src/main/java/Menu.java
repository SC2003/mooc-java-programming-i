
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if (this.meals.contains(meal)) {
            return;
        }
        this.meals.add(meal);
    }

    public void printMeals() {
        for (String food : meals) {
            System.out.println(food);
        }
    }

    public void clearMenu() {
        meals.clear();
    }
}
