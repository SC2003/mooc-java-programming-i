
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avgNum = 0.0;
        int totalNum = 0;
        int sumOfNum = 0;
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            totalNum++;
            if(num == 0) {
                break;
            }
            sumOfNum += num;
            avgNum = (double) sumOfNum / totalNum;
        }
        System.out.println("Average of the numbers: " + avgNum);
    }
}
