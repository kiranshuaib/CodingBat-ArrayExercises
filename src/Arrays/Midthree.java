package Arrays;
/*

Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
 */

import java.util.Arrays;

public class Midthree {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(midThree(new int[] {1,2,3,4,5})));
        System.out.println(Arrays.toString(midThree(new int[] {8,6,7,5,6,0,9})));

    }
    public static int[] midThree(int[] nums) {
        if (nums.length == 3){
            return nums;
        }
        int numsnew [] = new int[3];
        numsnew[0] = nums[nums.length/3];
        numsnew[1] = nums[nums.length/3 +1];
        numsnew[2] = nums[nums.length/3 +2];
        return numsnew;
    }

}
