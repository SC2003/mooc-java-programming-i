
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> itemList;
    private final int maxWeight;

    public Suitcase(int maxWeight) {
        this.itemList = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int localMax = this.totalWeight() + item.getWeight();
        if (localMax <= maxWeight) {
            this.itemList.add(item);
        }
    }

    public void printItems() {
        for (Item item : this.itemList) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Item item : this.itemList) {
            total += item.getWeight();
        }
        return total;
    }

    public Item heaviestItem() {
        if (this.itemList.isEmpty()) {
            return null;
        }
        Item returnObj = this.itemList.get(0);
        for (Item item: this.itemList) {
            if(returnObj.getWeight() < item.getWeight()) {
                returnObj = item;
            }
        }
        return returnObj;
    }

    public String toString() {
        String outputStr = "";
        if (this.itemList.isEmpty()) {
            outputStr = "no items";
        }
        if (this.itemList.size() == 1) {
            outputStr = "1 item";
        }
        if (this.itemList.size() > 1) {
            outputStr = this.itemList.size() + " items";
        }
        return (outputStr + " (" + this.totalWeight() + " kg)");
    }
}
