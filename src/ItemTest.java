import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    Item kirby;

    @BeforeEach
    void runBefore() {
        kirby = new Item("Kirby", "Keychain", 5.00, 10);
    }

    @Test
    void testConstructor() {
        assertEquals("Kirby", kirby.getName());
        assertEquals("Keychain", kirby.getCategory());
        assertEquals(5.00, kirby.getPrice());
        assertEquals(10, kirby.getQuantity());
        assertNull(kirby.getColour());
    }

    @Test
    void testSubtractQuantityByOne() {
        // subtract one quantity
        kirby.subtractQuantityByOne();
        assertEquals(9, kirby.getQuantity());

        // subtract multiple consecutively
        kirby.subtractQuantityByOne();
        kirby.subtractQuantityByOne();
        assertEquals(7, kirby.getQuantity());
    }
}
