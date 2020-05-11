package Arrays;
/*

 */

import java.util.Arrays;

public class FrontPiece {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(frontPiece(new int[] {1,2,3})));
        System.out.println(Arrays.toString(frontPiece(new int[] {1,2})));
        System.out.println(Arrays.toString(frontPiece(new int[] {1})));
    }
    public static int[] frontPiece(int[] nums) {
        if(nums.length >2){
            int[] newint = new int[]{nums[0],nums[1]};
            return newint;
        }return nums;
    }
}
