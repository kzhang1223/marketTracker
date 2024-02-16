import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tracker {

    // keeps track of the items in two lists, one that is in stock and one that is out of stock
    // should have functions that can calculate the total amount sold and number of items sold
    // maybe will implement date/time in the future

    private HashMap<Item, Integer> inStock;
    private HashMap<Item, Integer> outOfStock;

    public Tracker() {
        inStock = new HashMap<>();
        outOfStock = new HashMap<>();
    }

    // EFFECTS: adds an item to the inStock list
    public void addInStock(Item item, int quantity) {
        // TODO
    }

    // EFFECTS: adds an item to the outOfStock list
    public void addOutOfStock(Item item, int quantity) {
        // TODO
    }

    // EFFECTS: moves an item from the inStock list to the outOfStock list if it has quantity of 0
    public void moveToOut(Item item) {
        // TODO
    }

    // getters
    public HashMap<Item, Integer> getInStock() {
        return inStock;
    }

    public HashMap<Item, Integer> getOutOfStock() {
        return outOfStock;
    }
}
