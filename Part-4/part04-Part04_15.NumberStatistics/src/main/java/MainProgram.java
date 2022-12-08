
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        //Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
        Statistics allNumsStat = new Statistics();
        Statistics evenNumsStat = new Statistics();
        Statistics oddNumsStat = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int nums = Integer.valueOf(scanner.nextLine());
            if (nums == -1) {
                break;
            }
            allNumsStat.addNumber(nums);
            if (nums % 2 == 0) {
                evenNumsStat.addNumber(nums);
            }
            if (nums % 2 != 0) {
                oddNumsStat.addNumber(nums);
            }

        }
        System.out.println("Sum: " + allNumsStat.sum());
        System.out.println("Sum of even numbers: " + evenNumsStat.sum());
        System.out.println("Sum of odd numbers: " + oddNumsStat.sum());
    }
}
