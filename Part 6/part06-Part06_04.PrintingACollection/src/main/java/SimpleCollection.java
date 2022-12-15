
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String defaultOutput = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            return (defaultOutput + " is empty.");
        }
        String elementsName = "";
        int size = this.elements.size();
        for (String element : elements) {
            if(size <=1) {
                elementsName = element;
            } else {
                elementsName += element + "\n";
            }
        }
        String elementString = "";

        if (elements.size() > 1) {
            elementString = "elements:\n";
        } else {
            elementString = "element:\n";
        }
        return (defaultOutput + " has " + size + " " + elementString + elementsName);
    }
}
