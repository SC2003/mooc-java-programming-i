
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scanFile = new Scanner(Paths.get(file))) {

            while (scanFile.hasNextLine()) {

                String read = scanFile.nextLine();
                lines.add(read);

            }
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();

            if (lines.contains(searchedFor)) {

                System.out.println("Found!");

            } else {

                System.out.println("Not found.");

            }
        } catch (Exception e) {

            System.out.println("Reading the file " + e.getMessage() + "failed.");

        }

    }
}
