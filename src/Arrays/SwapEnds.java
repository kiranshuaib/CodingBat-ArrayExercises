package Arrays;
/*

Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.


 */

import java.util.Arrays;

public class SwapEnds {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapEnds(new int[] {1,2,3})));
        System.out.println(Arrays.toString(swapEnds(new int[] {8,6,7,9,5})));

    }
    public static int[] swapEnds(int[] nums) {
        int temp = 0;
        temp = nums[0] ;
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]= temp;
        return nums;


    }
}
