
import java.util.ArrayList;
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, World!");
        multiplicationTable(2);

//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        System.out.println(numbers);
//        int index = numbers.size() - 1;
//        while (index >= 0) {
//            int number = numbers.get(index);
//            System.out.println(number);
//            index = index - 1;
//        }
//        for (int i = numbers.size() - 1; i >= 0; i--) {
//            System.out.println(numbers.get(i));
//        }
    }

    public static void multiplicationTable(int max) {
        int number = 1;

        while (number <= max) {
            printMultiplicationTableRow(number, max);
            number++;
        }
    }

    public static void printMultiplicationTableRow(int number, int coefficient) {

        int printable = number;
        while (printable <= number * coefficient) {
            System.out.print("  " + printable);
            printable += number;
        }

        System.out.println("");
    }

}
