
package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameFormatterTest {

    @Test
    public void testSimpleName() {
        String result = NameFormatter.format("Mel", "Johnson");
        assertEquals("Johnson, Mel", result);
    }

    @Test
    public void testFullName() {
        String result = NameFormatter.format("Dr. Mel B Johnson, PhD");
        assertEquals("Johnson, Dr. Mel B, PhD", result);
    }

    @Test
    public void testAllParts() {
        String result = NameFormatter.format(
                "Dr.", "Mel", "B", "Johnson", "PhD"
        );
        assertEquals("Johnson, Dr. Mel B, PhD", result);
    }
}
