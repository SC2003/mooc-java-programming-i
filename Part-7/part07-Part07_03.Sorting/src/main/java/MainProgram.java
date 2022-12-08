
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12};
//
//        System.out.println(smallest(array));
        //Part 1
//        int[] numbers = {6, 5, 8, 7, 11};
//        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        //Part 2
        // indices:      0  1  2  3  4
//        int[] numbers = {6, 5, 8, 7, 11};
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        //Part 3
        // indices:       0  1  2  3   4
//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        //Part 4
//        int[] numbers = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));
        //Part 5
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallestValue = array[array.length - 1];
        for (int value : array) {
            smallestValue = Math.min(smallestValue, value);
        }
        return smallestValue;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallestValue = smallest(array);
        for (int value : array) {
            if (value == smallestValue) {
                return index;
            }
            index++;
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallestValue = table[startIndex];
        for (int i = index; i < table.length; i++) {
            if (table[i] < smallestValue) {
                smallestValue = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
