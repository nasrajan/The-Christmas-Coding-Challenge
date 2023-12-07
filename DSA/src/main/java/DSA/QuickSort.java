package DSA;

public class QuickSort {
    QuickSort() {

    }

    public static void quicksort(int[] nums) {
        quicksort(nums, 0, nums.length-1);
    }

    private static void quicksort(int[] nums, int low, int high) {

        if (low < high) {
            int pivot = partition(nums, low, high);
            quicksort(nums, low, pivot-1);
            quicksort(nums, pivot + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;

        for (int j = low; j < high; j++ ) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, high);
        return i+1;

    }

    void prettyprint(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " , ");
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
