import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void shouldReturnHelloWorld() {
        String expected = "Hello World";
        String actual = Main.greeting();
        Assertions.assertEquals(expected, actual);
    }
}