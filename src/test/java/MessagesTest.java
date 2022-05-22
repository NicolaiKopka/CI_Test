import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessagesTest {
    @Test
    void shouldReturnHelloWorld() {
        String expected = "Hello World";
        String actual = Messages.greeting();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCIMessage() {
        String expected = "New clone";
        String actual = Messages.cloned();
        Assertions.assertEquals(expected, actual);
    }
}
