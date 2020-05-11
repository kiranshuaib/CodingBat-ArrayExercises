package Arrays;

//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


import java.util.Arrays;

public class RotateLeft3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(rotateLeft3(new int[]{5, 11, 9})));
    }
    public static int[] rotateLeft3(int[] nums) {
        int[] numsCh = new int[]{nums[1],nums[2],nums[0]};
        return numsCh;
    }

}
