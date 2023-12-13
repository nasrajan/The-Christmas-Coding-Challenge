package DSA.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSearch {

    @Test
    void testLinearSearchWithKnownTarget() {
        int[] nums = new int[] {7, 4, 1, 2, 4, 9};
        int found = Search.linearSearch(nums, 1);
        assertEquals(2, found);
    }
    @Test
    void testLinearSearchWithUnKnownTarget() {
        int[] nums = new int[] {7, 4, 1, 2, 4, 9};
        int found = Search.linearSearch(nums, 8);
        assertEquals(-1, found);
    }
    @Test
    void testBinarySearchWithKnownTarget() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int found = Search.binarySearch(nums, 5);
        assertEquals(4, found);
    }
    @Test
    void testBinarySearchWithUnKnownTarget() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int found = Search.binarySearch(nums, 8);
        assertEquals(-1, found);
    }
}
