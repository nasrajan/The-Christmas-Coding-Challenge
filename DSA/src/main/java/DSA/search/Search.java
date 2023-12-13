package DSA.search;

public class Search {

    Node root;
    static int linearSearch(int[] nums, int target) {
        for(int i=0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1; // target is not present in the array
    }

    static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;


        while(low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target < nums[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    Node binaryTreeSearch(int target) {
        return null;
    }

    void createBinarySearchTree(int[] nums) {
        for(int n: nums) {
            insert(n);
        }
    }

    private void insert(int n) {
        if (root == null) {
            root = new Node(n);
        }
        Node node = root;
        while(node != null) {
            if(n < node.value) {
                node = node.left;
            }
        }

    }

    private class Node {
        int value;
        Node left;
        Node right;
        Node(int val) {
            this.value = val;
            this.right = null;
            this.left = null;
        }
    }
}
