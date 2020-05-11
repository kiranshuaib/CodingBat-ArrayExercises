package Arrays;
/*

Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.
 */

public class MaxTriple {
    public static void main(String[] args) {
         System.out.println((maxTriple(new int[] {1,2,3,4})));
         System.out.println((maxTriple(new int[] {1,5,3})));
         System.out.println((maxTriple(new int[] {5,2,3})));

    }

    public static int maxTriple(int[] nums) {
        if (nums[0] > nums[nums.length - 1] && nums[0] > nums[nums.length / 2]) {
            return nums[0];
        } else if (nums[nums.length / 2] > nums[nums.length - 1] && nums[nums.length / 2] > nums[0]) {
            return nums[nums.length / 2];
        }
        return 0;
    }
}