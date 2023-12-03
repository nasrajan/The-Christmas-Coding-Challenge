import DSA.MergeSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestMergeSort {

    @Test
    public void testArrayIsSorted() {
        int[] input = new int[] {1, 9, 4, 2, 8};
        MergeSort mergeSort = new MergeSort(input);
        assertArrayEquals(new int[] {1, 2, 4, 8, 9}, mergeSort.sort());
    }
}
