package DSA.LeetCode;

public class RemoveDuplicateFromSoredArray {
    public int removeDuplicates(int[] nums) {
        int pos = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        return pos;
    }
    public int removeDuplicatesII(int[] nums) {
        int pos = 1;
        int freq = 1;
        for(int i=1; i<nums.length;i++) {
            if(nums[i] == nums[i-1]) {
                freq++;
            } else {
                freq = 1;
            }
            if(freq <=2) {
                nums[pos++] = nums[i];
            }
        }

        return pos;
    }
}
