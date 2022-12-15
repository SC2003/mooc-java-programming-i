
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner, ArrayList<Recipe> recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        this.readFile();
        this.commandOptions();
        while (true) {
            String command = this.scanner.nextLine();
            switch (command) {
                case "stop":
                    return;
                case "list":
                    this.listRecipes();
                    break;
                case "find name":
                    this.searchByName();
                    break;
                case "find cooking time":
                    this.searchByTime();
                    break;
                case "find ingredient":
                    this.searchByIngredient();
                    break;
            }
        }

    }

    private void readFile() {
        System.out.println("File to read");
        String file = this.scanner.nextLine();
        String recipes = "";
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.equals("")) {
                    recipes += line + "\n";
                } else {
                    recipes += line + ",";
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        this.addToList(recipes);
    }

    private void commandOptions() {
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    private void addToList(String recipes) {
        String[] recipe = recipes.split("\n");
        for (int i = 0; i < recipe.length; i++) {
            Recipe newRec = (Recipe) new Recipe();
            newRec.add(recipe[i]);
            this.recipes.add(newRec);
        }
    }

    private void listRecipes() {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    private void searchByName() {
        System.out.println("Searched word :");
        String name = this.scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    private void searchByTime() {
        System.out.println("Max cooking time: ");
        int time = Integer.valueOf(this.scanner.nextLine());
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    private void searchByIngredient() {
        System.out.println("Igredient: ");
        String ingredient = this.scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }

}
