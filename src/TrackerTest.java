import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrackerTest {
    Item kirby;
    Item frog;
    Item penguin;
    Tracker t1;

    @BeforeEach
    void runBefore() {
        kirby = new Item("Kirby", "keychain", 5);
        frog = new Item("Frog", "plush", 5);
        penguin = new Item("Penguin", "plush", 8);
        t1 = new Tracker();
    }

    @Test
    void testConstructor() {
        assertEquals(0, t1.getInStock().size());
        assertEquals(0, t1.getOutOfStock().size());
    }

    @Test
    void testAddInStock() {
        // add one item
        t1.addInStock(kirby, 1);
        assertEquals(1, t1.getInStock().size());
        assertEquals(1, t1.getInStock().get(kirby));
        assertTrue(t1.getInStock().containsKey(kirby));

        // add multiple items one after another

        // try to add an out-of-stock item (quantity = 0) but should not work

        // add an item with quantity > 0

        // add multiple items with quantity > 0

        // add an item not in the inStock list, should create a new entry for this item
    }
}
