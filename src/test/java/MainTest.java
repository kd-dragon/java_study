import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void arrTest() {
        Main main = new Main();
        assertNotNull(main.arr());
    }
}