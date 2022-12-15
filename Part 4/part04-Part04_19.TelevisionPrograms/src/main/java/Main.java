
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }
            System.out.println("Duration:");
            int showDuration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(showName, showDuration));
        }
        System.out.println("Program's maximum duration?");
        int showDurationLimit = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram show : programs) {
            if (show.getDuration() <= showDurationLimit) {
                System.out.println(show);
            }
        }
    }
}
