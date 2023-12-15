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

    Node createBinarySearchTree(int[] nums) {
        for(int n: nums) {
            insert(n);
        }
        return root;
    }

    private Node insert(int n) {
        if (root == null) {
            root = new Node(n);
            return root;
        }

        Node node = root;
        while(node != null ) {
            if(n < node.value && node.left == null) {
                node.left = new Node(n);
               break;
            } else if (node.left != null) {
                node = node.left;
            }
            if(n > node.value && node.right == null) {
                node.right = new Node(n);
                break;
            } else if (node.right != null) {
                node = node.right;
            }
        }

        return root;
    }

    void inOrderTraverse(Node root) {
        if(root.left != null) {
            inOrderTraverse(root.left);
        }
        System.out.println(root.value);
        if(root.right != null) {
            inOrderTraverse(root.right);
        }
    }

     class Node {
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
