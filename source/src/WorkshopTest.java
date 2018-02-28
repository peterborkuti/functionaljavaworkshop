import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import java.util.Arrays;

public class WorkshopTest {
    @Test
    public void intArrayJoinTest() {
        assertEquals(
                Workshop.intArrayJoin(new int[]{}), "");
        assertEquals(
                Workshop.intArrayJoin(new int[]{1}), "1");
        assertEquals(
                Workshop.intArrayJoin(new int[]{1,2}), "1,2");
        assertEquals(
                Workshop.
                        intArrayJoin(
                                new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE}),
                "" + Integer.MAX_VALUE + "," + Integer.MIN_VALUE);
    }

    @Test
    public void intArraySumTest() {
        assertEquals(
                Workshop.intArraySum1(new int[]{}), 0);
        assertEquals(
                Workshop.intArraySum1(new int[]{1}), 1);
        assertEquals(
                Workshop.intArraySum1(new int[]{1,2}), 3);
        assertEquals(
                Workshop.
                        intArraySum1(
                                new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE}),
                2 * Integer.MAX_VALUE);
    }

    @Test
    public void compareTheTripletsTest() {
        assertEquals(
                Workshop.compareTheTriplets(new String[]{"1","0"}), "1,0");
        assertEquals(
                Workshop.compareTheTriplets(new String[]{"0","1"}), "0,1");
        assertEquals(
                Workshop.compareTheTriplets(new String[]{"1","1"}), "0,0");
    }

    @Test
    public void findTheFirstTest() {
        assertEquals( 8, Workshop.findTheFirst(Arrays.asList(1,2,3,5,4,6,7,8,9)));
    }

    @Test
    public void findTheFirstTest2() {
        System.out.println("FindFirstRandom:" + Workshop.findTheFirstInRandStream());
    }

}
