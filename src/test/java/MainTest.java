import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void basicTests() {

        assertEquals(Arrays.asList("1: a", "2: b", "3: c"), Main.number(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), Main.number(Arrays.asList("", "", "", "", "")));
    }
}
