
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // 1st
        int firstFrom = 1;
        System.out.println("Where to?");
        int firstTo = Integer.valueOf(scanner.nextLine());
        while (firstFrom <= firstTo) {
            System.out.println(firstFrom);
            firstFrom++;
        }
        // 2nd

        System.out.println("Where to?");
        int secondTo = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int secondFrom = Integer.valueOf(scanner.nextLine());
        while (secondFrom <= secondTo) {
            System.out.println(secondFrom);
            secondFrom++;
        }
    }
}
