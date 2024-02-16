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
        assertNull(kirby.getColour());
    }
}
