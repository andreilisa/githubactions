package presentation.devops.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class DemoTest {

    @Test
    public void demoTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void demoTest2() {
        assertNotEquals(2, 1 + 3);
    }
}
