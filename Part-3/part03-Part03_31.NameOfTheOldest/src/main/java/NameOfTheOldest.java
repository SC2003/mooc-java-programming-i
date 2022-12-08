
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String oldestName = "";
        while (true) {
            String text = scanner.nextLine();
            if ((text.equals(""))) {
                break;
            }

            String[] textArray = text.split(",");

            if (oldestAge < Integer.valueOf(textArray[1])) {
                oldestAge = Integer.valueOf(textArray[1]);
                oldestName = textArray[0];
            }
            
        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
