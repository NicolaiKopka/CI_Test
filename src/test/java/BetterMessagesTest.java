import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BetterMessagesTest {
    @Test
    void shouldReturnHelloWorld() {
        String expected = "Hello World";
        String actual = BetterMessages.greeting();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCIMessage() {
        String expected = "New clone";
        String actual = BetterMessages.cloned();
        Assertions.assertEquals(expected, actual);
    }
}
