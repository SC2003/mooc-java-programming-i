
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            switch (command) {
                case "X":
                    //System.out.println("Ended!");
                    return;
                case "1":
                    add();
                    break;
                case "2":
                    draw();
                    break;
                case "3":
                    printAll();
                    break;

            }
        }
    }

    private void add() {
        System.out.println("Write the joke to be added:");
        String joke = this.scanner.nextLine();
        this.jokes.addJoke(joke);
    }

    private void draw() {
        System.out.println("Drawing a joke.");
        System.out.println(this.jokes.drawJoke());
    }

    public void printAll() {
        System.out.println("Printing the jokes.");
        this.jokes.printJokes();
    }
}
