
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner inputScanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = inputScanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(inputScanner.nextLine());
            System.out.println("Publication year:");
            int publicaionYear = Integer.valueOf(inputScanner.nextLine());

            books.add(new Book(title, pages, publicaionYear));
        }

        System.out.println("What information will be printed?");
        String whatToPrint = inputScanner.nextLine();

        for (Book book : books) {
            if (whatToPrint.equals("everything")) {
                System.out.println(book);
            }
            if (whatToPrint.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
