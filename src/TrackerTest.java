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
        kirby = new Item("Kirby", "keychain", 5, 2);
        frog = new Item("Frog", "plush", 5, 5);
        penguin = new Item("Penguin", "plush", 8, 0);
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

        // add multiple items one after another

        // try to add an out of stock item (quantity = 0) but should not work 
    }
}
