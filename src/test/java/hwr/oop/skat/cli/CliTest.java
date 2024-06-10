package hwr.oop.skat.cli;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class CliTest {
    @Test
    void main_CanBeCalled() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
