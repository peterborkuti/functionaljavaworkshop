import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SourcesTest {
    @Test
    public void getIndexHtmlTest() {
        String file = Sources.getIndexHtml();
        assertTrue(file.indexOf("<title>Index</title>") > -1);
    }

    @Test
    public void powerOfTwoTest() {
        assertEquals("", 1024, Sources.getPowerOfTwo(10));

    }
}
