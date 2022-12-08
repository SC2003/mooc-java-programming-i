
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfBirthYear = 0;
        int count = 0;
        String longestName = "";
        double avgOfBirthYear = 0.0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] textArray = input.split(",");
            int nameLength = longestName.length();
            int arrayNameLength = textArray[0].length();
            if (nameLength < arrayNameLength) {
                nameLength = arrayNameLength;
                longestName = textArray[0];
            }
            sumOfBirthYear += Integer.valueOf(textArray[1]);
            count++;
        }
        System.out.println("Longest name: " + longestName);
        avgOfBirthYear = (1.0 * sumOfBirthYear / count);
        System.out.println("Average of the birth years: " + avgOfBirthYear);
    }
}
