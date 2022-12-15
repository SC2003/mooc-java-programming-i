
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        //take the user input and save it in msg variable
        String message = scanner.nextLine();
        //print user input
        System.out.println(message);
    }
}
