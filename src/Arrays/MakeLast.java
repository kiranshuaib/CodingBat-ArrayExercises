package Arrays;
/*

Given an int array, return a new array with double the length where its last element is the same as the original array,
and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
 */

import java.util.Arrays;

public class MakeLast {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(makeLast(new int[]{1,2})));
        System.out.println(Arrays.toString(makeLast(new int[]{3})));
    }
    public static int[] makeLast(int[] nums) {
        int[] arr2 = new int [nums.length*2];
        arr2[arr2.length-1] = nums[nums.length -1];
        return arr2;
    }
}
