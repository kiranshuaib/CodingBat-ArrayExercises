package Arrays;
/*

Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 */


import java.util.Arrays;

public class Reverse3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse3(new int[] {1,2,3})));
    }
    public static int[] reverse3(int[] nums) {
        int[] numsReverse = new int[]{nums[2],nums[1],nums[0]};
        return numsReverse;
    }

}
