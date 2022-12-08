
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitCaseList;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitCaseList = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int localMax = this.totalWeight() + suitcase.totalWeight();
        if (localMax <= maxWeight) {
            this.suitCaseList.add(suitcase);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : this.suitCaseList) {
            total += suitcase.totalWeight();
        }
        return total;
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitCaseList) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return (this.suitCaseList.size() + " suitcases (" + this.totalWeight() + " kg )");
    }
}
