package Arrays;
/*

Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
 */

import java.util.Arrays;

public class Plus2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusTwo(new int[] {1,2},new int[] {3,4})));
        System.out.println(Arrays.toString(plusTwo(new int[] {4,4},new int[] {2,2})));
        System.out.println(Arrays.toString(plusTwo(new int[] {9,2},new int[] {3,4})));

    }
    public static int[] plusTwo(int[] a, int[] b) {
        int[] newArr = new int[]{a[0],a[1],b[0],b[1]};
        return newArr;
    }
}
