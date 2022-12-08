
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if ((text.equals(""))) {
                break;
            }

            String[] textArray = text.split(" ");
            for (String txt : textArray) {
                if (txt.contains("av")) {
                    System.out.println(txt);
                }
            }
        }
    }
}
