
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        //this way
//        int index = 0;
//        for (int ary : array) {
//            System.out.print(ary);
//            if (index < (array.length -1)) {
//                System.out.print(", ");
//            }
//            index++;
//        }
//        System.out.println("");
        //or this way
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < (array.length - 1)) {
                System.out.print(", ");
            }
        }
    }
}
