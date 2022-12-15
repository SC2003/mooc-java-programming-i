
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scanFile = new Scanner(Paths.get(file))) {

            while (scanFile.hasNextLine()) {

                String read = scanFile.nextLine();
                if(read.isEmpty()) {
                    break;
                }
                String[] readAry = read.split(",");
                
                System.out.println(readAry[0] + ", age: " + readAry[1] + " years");
            }

            

        } catch (Exception e) {

            System.out.println("Reading the file " + e.getMessage() + "failed.");

        }
    }
}
