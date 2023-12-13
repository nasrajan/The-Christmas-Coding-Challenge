package DSA.sorting;

public class MergeSort {
    int[] input;

    public MergeSort(int[] input) {
        this.input = input;
    }

    private void prettyPrint(int[] sort) {
        for(int i=0; i<sort.length; i++) {
            System.out.print(sort[i] + " , ");
        }
        System.out.println();
    }

    public void merge(int arr[], int left, int mid, int right) {
        if(arr.length <= 1) return;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while(i< n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while( i < n1) {
            arr[k++] = L[i++];
        }
        while( j < n2) {
            arr[k++] = R[j++];
        }
        prettyPrint(arr);
        return;
    }

    public int[] sort() {
         sort(this.input, 0, this.input.length-1);
         return input;
    }
    void sort(int arr[], int left, int right)
    {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Sort first and second halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }
}
