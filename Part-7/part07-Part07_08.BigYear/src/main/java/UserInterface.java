
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Bird> birdList;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birdList = new ArrayList<>();

    }

    public void start() {
        while (true) {
            System.out.println("?");
            String command = input();

            switch (command.toLowerCase()) {
                case "quit":
                    return;
                case "add":
                    this.add();
                    break;
                case "observation":
                    this.observation();
                    break;
                case "all":
                    this.printAll();
                    break;
                case "one":
                    this.printOne();
                    break;
                default:
                    continue;
            }
        }
    }

    public String input() {
        String input = this.scanner.nextLine();
        return input;
    }

    private void add() {
        System.out.println("Name:");
        String nameEng = input();
        System.out.println("Name in Lation:");
        String nameLatin = input();
        this.birdList.add(new Bird(nameEng, nameLatin));
    }

    private void observation() {
        System.out.println("Bird?");
        String birdName = input();
        for (Bird bird : this.birdList) {
            if (bird.getNameEng().contains(birdName)
                    || bird.getNameLatin().contains(birdName)) {

                bird.setObservation(bird.getObservation() + 1);
            } else {
                System.out.println("Not a bird!");
            }
        }
    }

    private void printAll() {
        for (Bird bird : this.birdList) {
            System.out.println(bird);
        }
    }

    private void printOne() {
        System.out.println("Bird?");
        String birdName = input();
        for (Bird bird : this.birdList) {
            if (bird.getNameEng().contains(birdName)
                    || bird.getNameLatin().contains(birdName)) {

                System.out.println(bird);
            } else {
                System.out.println("Not in List!!");
            }
        }
    }

}
