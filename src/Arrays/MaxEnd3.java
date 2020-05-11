package Arrays;
/*

Given an array of ints length 3,
figure out which is larger, the first or last element in the array,
and set all the other elements to be that value. Return the changed array.
 */

import java.util.Arrays;

public class MaxEnd3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxEnd3(new int[] {1,2,3})));
        System.out.println(Arrays.toString(maxEnd3(new int[] {11,5,9})));
        System.out.println(Arrays.toString(maxEnd3(new int[] {2,11,3})));
    }
    public static int[] maxEnd3(int[] nums) {
        if(nums[0]>= nums[2] ){
            int [] numsNew = new int[] {nums[0],nums[0],nums[0]};
            return numsNew;
        }else if(nums[2]>= nums[0]){
            int [] numsNew = new int[] {nums[2],nums[2],nums[2]};
            return numsNew;
        }return nums;
    }

}
