package Arrays;
/*

Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
 The original array will be length 2 or more.
 */

import java.util.Arrays;

public class MakeMiddle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeMiddle(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(makeMiddle(new int[] {7,1,2,3,4,9})));

    }
    public static int[] makeMiddle(int[] nums) {
        int[] newArr = new int[2];
        newArr[0] = nums[nums.length/2-1];
        newArr[1] = nums[nums.length/2];
        return newArr;
    }
}
