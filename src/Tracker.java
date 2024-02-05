import java.util.ArrayList;
import java.util.List;

public class Tracker {

    // keeps track of the items in two lists, one that is in stock and one that is out of stock
    // should have functions that can calculate the total amount sold and number of items sold
    // maybe will implement date/time in the future

    private List<Item> inStock;
    private List<Item> outOfStock;

    public Tracker() {
        inStock = new ArrayList<>();
        outOfStock = new ArrayList<>();
    }

    // EFFECTS: adds an item to the inStock list
    public void addInStock(Item item) {
        // TODO
    }

    // EFFECTS: adds an item to the outOfStock list
    public void addOutOfStock(Item item) {
        // TODO
    }

    // EFFECTS: moves an item from the inStock list to the outOfStock list if it has quantity of 0
    public void moveToOut(Item item) {
        // TODO
    }

    // getters
    public List<Item> getInStock() {
        return inStock;
    }

    public List<Item> getOutOfStock() {
        return outOfStock;
    }
}
