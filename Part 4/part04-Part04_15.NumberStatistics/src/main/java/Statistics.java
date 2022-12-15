
import java.util.ArrayList;

public class Statistics {

    //private ArrayList<Integer> numbers = new ArrayList<>();
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variables count and sum here
        count = 0;
        sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        //this.numbers.add(number);
        this.sum += number;
        this.count++;
    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        // write code here
//        for (int num : this.numbers) {
//            this.sum += num;
//        }
        return this.sum;
    }

    public double average() {
        // write code here
        if (this.sum == 0 || this.count == 0) {
            return 0;
        }
        return ((double) this.sum / this.count);
    }
}
