
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int totalNum = 0;
        double avgNum = 0.0;
        int evenNum = 0;
        int oddNum = 0;
        System.out.println("Give numbers:");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                evenNum++;
            }
            if (num % 2 != 0) {
                oddNum++;
            }
            sum += num;
            totalNum++;
            avgNum = (double) sum/totalNum;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNum);
        System.out.println("Average: " + avgNum);
        System.out.println("Even: " + evenNum);
        System.out.println("Odd: " + oddNum);
    }
}
