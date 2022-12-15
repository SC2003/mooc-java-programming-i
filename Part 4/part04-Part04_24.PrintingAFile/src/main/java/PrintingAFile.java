
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        //The Main Program
//        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
//            while (scanner.hasNextLine()) {
//                String data = scanner.nextLine();
//                System.out.println(data);
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
        // This One Prints Data as String instead of
        // whatever gibberish java thinks the file contains
        try (Scanner scanner = new Scanner(Paths.get("test.txt"))) {
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data.toString());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
