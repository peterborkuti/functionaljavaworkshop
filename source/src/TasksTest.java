import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TasksTest {
    @Test
    public void concatListTest() {
        assertEquals("", Tasks.concatList(Arrays.asList()));
        assertEquals("a,b,c", Tasks.concatList(Arrays.asList("a", "b", "c")));
    }
}
