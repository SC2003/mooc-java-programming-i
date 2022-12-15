
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] arrayInt = {3, 1, 5, 99, 3, 12};
        System.out.println("int :" + Arrays.toString(arrayInt));
        sort(arrayInt);
        System.out.println("int (ordered):" + Arrays.toString(arrayInt));
        
        String[] arrayStr = {"c", "a", "e", "z", "c", "l"};
        System.out.println("String :" + Arrays.toString(arrayStr));
        sort(arrayStr);
        System.out.println("String (ordered):" + Arrays.toString(arrayStr));
        
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(1);
        intList.add(5);
        intList.add(99);
        intList.add(3);
        intList.add(12);
        System.out.println("intList :" + intList.toString());
        sortIntegers(intList);
        System.out.println("intList (ordered):" + intList.toString());
        
        ArrayList<String> strList = new ArrayList<>();
        strList.add("c");
        strList.add("a");
        strList.add("e");
        strList.add("z");
        strList.add("c");
        strList.add("l");
        System.out.println("strList :" + strList.toString());
        sortStrings(strList);
        System.out.println("strList (ordered):" + strList.toString());
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integer) {
        Collections.sort(integer);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
