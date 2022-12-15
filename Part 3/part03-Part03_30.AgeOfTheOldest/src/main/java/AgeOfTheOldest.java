
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        while (true) {
            String text = scanner.nextLine();
            if ((text.equals(""))) {
                break;
            }

            String[] textArray = text.split(",");

            if (oldestAge < Integer.valueOf(textArray[1])) {
                oldestAge = Integer.valueOf(textArray[1]);
            }
            
        }
        System.out.println("Age of the oldest: " + oldestAge);
    }

}
