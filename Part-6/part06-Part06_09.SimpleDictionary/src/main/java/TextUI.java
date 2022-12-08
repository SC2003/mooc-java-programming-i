
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
//            if(command.equals("end")) {
//                System.out.println("Bye bye!");
//                break;
//            } else if(command.equals("add")) {
//                System.out.println("Word:");
//                String word = this.scanner.nextLine();
//                System.out.println("Translation:");
//                String translation = this.scanner.nextLine();
//                this.dict.add(word, translation);
                //or simply call the add() method
//                continue;
//            }  else if(command.equals("search")) {
//                System.out.println("To be translated:");
//                String word = this.scanner.nextLine();
//                System.out.println("Translation: " + this.dict.translate(word));
                //same as above just call the search() method
//                continue;
//            } else {
//                System.out.println("Unknown command");
//            }
            //using switch case to try out clean coding :)
            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    return;
                case "add":
                    add();
                    break;
                case "search":
                    search();
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    private void add() {
        System.out.println("Word:");
        String word = this.scanner.nextLine();
        System.out.println("Translation:");
        String translation = this.scanner.nextLine();
        this.dict.add(word, translation);
    }

    private void search() {
        System.out.println("To be translated:");
        String word = this.scanner.nextLine();
        if(this.dict.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
            return;
        }
        System.out.println("Translation: " + this.dict.translate(word));
    }
}
