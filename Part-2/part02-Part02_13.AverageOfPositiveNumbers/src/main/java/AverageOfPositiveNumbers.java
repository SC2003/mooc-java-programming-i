
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveNum = 0;
        double avgOfPNum = 0;
        int sumOfNum = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            if (num > 0) {
                positiveNum++;
            }
            sumOfNum += num;
            avgOfPNum = (double) sumOfNum / positiveNum;
        }
        if (positiveNum == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }
        System.out.println(avgOfPNum);
    }
}
