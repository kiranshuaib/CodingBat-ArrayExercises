package Arrays;

import java.util.Arrays;

public class MakeEnds {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeEnds(new int[] {1,2,3})));
        System.out.println(Arrays.toString(makeEnds(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(makeEnds(new int[] {7,4,6,2})));
    }

    public static int[] makeEnds(int[] nums) {
        int[] markEnds = new int []{nums[0],nums[nums.length-1]};
        return markEnds;
    }
}
