
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //
        //Part 1
        //
//        GradeRegister register = new GradeRegister();
//        register.addGradeBasedOnPoints(93);
//        register.addGradeBasedOnPoints(91);
//        register.addGradeBasedOnPoints(92);
//        register.addGradeBasedOnPoints(88);
//
//        System.out.println(register.averageOfGrades());
        //
        //Part 2
        //
//        GradeRegister register = new GradeRegister();
//        register.addGradeBasedOnPoints(93);
//        register.addGradeBasedOnPoints(91);
//        register.addGradeBasedOnPoints(92);
//
//        System.out.println(register.averageOfPoints());
        //
        //Part 3
        //
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
