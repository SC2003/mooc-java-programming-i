
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNum = 0;
        int sumOfNum = 0;
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            sumOfNum += num;
            totalNum++;
        }
        System.out.println("Number of numbers: " + totalNum);
        System.out.println("Sum of the numbers: " + sumOfNum);
    }
}
