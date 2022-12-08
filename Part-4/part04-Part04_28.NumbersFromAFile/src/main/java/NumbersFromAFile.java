
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();

        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> lines = new ArrayList<>();

        int count = 0;

        try (Scanner scanFile = new Scanner(Paths.get(file))) {

            while (scanFile.hasNextLine()) {

                int read = Integer.valueOf(scanFile.nextLine());
                lines.add(read);

            }

            for (int nums : lines) {

                if ((nums >= lowerBound) && (nums <= upperBound)) {

                    count++;

                }

            }

        } catch (Exception e) {

            System.out.println("Reading the file " + e.getMessage() + "failed.");

        }

        System.out.println("Numbers: " + count);

    }

}
