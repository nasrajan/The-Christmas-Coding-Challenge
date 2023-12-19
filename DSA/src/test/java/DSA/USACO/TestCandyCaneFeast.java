package DSA.USACO;

import DSA.Bronze.CandyCaneFeast;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestCandyCaneFeast {
    @Test
    void testCowsEating() {
        int[] cows = new int[] {3, 2, 5};
        int[] candies = new int[] {6, 1};
        CandyCaneFeast feast = new CandyCaneFeast(cows, candies);
        assertArrayEquals(new int[] {7, 2, 7}, feast.eatAndGrow());
    }
}
