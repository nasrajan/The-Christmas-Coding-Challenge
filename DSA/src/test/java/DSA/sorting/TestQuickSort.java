package DSA.sorting;

import DSA.sorting.QuickSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestQuickSort {

    @Test
    void testSort() {
        int[] nums = new int[] {5, 8, 3, 6, 1, 2};
        QuickSort.quicksort(nums);
        assertArrayEquals(new int[] {1, 2, 3, 5, 6, 8}, nums);
    }

    @Test
    void testSortEmptyArray() {
        int[] nums = new int[] {};
        QuickSort.quicksort(nums);
        assertArrayEquals(new int[] {}, nums);
    }

    @Test
    void testSortOneElementArray() {
        int[] nums = new int[] {1000};
        QuickSort.quicksort(nums);
        assertArrayEquals(new int[] {1000}, nums);
    }

    @Test
    void testSortLargeArray() {
        Random rand = new Random();
        int[] nums = new int[1000], expected = new int[1000];
        for (int i=0; i< 1000; i++) {
            nums[i] = rand.nextInt();
            expected[i] = nums[i];
        }

        Arrays.sort(expected);
        QuickSort.quicksort(nums);
        assertArrayEquals(expected, nums);
    }

}
