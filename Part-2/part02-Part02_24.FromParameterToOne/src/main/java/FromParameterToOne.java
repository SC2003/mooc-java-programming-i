

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne (int num) {
        for (; num >= 1; num--) {
            System.out.println(num);
        }
    }
}
