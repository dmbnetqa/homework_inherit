package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    public void testTaskMatch() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

boolean actual = simpleTask.matches("Позвонить");
boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

}