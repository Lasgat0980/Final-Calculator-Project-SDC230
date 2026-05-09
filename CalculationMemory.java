/*********************************************************
 * Name: Lastazia Dickens
 * Date: 05/08/2026
 * Assignment: SDC230 Final Project
 * Description: Encapsulates a collection of Strings representing
 * completed math operations, allowing for storage and recall.
 *********************************************************/
import java.util.ArrayList;

public class CalculationMemory {
    // String to hold the full operation text
    private ArrayList<String> collection = new ArrayList<>();
    private final int maximumSize = 10;

    public boolean addOperation(String op) {
        if (collection.size() < maximumSize) {
            collection.add(op);
            return true;
        }
        return false;
    }

    public void displayCollection() {
        if (collection.isEmpty()) {
            System.out.println("The memory vault is currently empty.");
        } else {
            System.out.println("\nSAVED OPERATIONS");
            for (int i = 0; i < collection.size(); i++) {
                System.out.println((i + 1) + ": " + collection.get(i));
            }
        }
    }

    public ArrayList<String> getCollection() {
        return collection;
    }

    public void clearMemory() {
    collection.clear();
    System.out.println("Memory vault has been wiped clean.");
   }
}
