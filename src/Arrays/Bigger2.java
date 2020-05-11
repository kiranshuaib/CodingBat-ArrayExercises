package Arrays;

import java.util.Arrays;

/*
Start with 2 int arrays, a and b, each length 2.
Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
 */
public class Bigger2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(biggerTwo(new int[] {1,2},new int[] {3,4})));
        System.out.println(Arrays.toString(biggerTwo(new int[] {3,4},new int[] {1,2})));
        System.out.println(Arrays.toString(biggerTwo(new int[] {1,1},new int[] {1,2})));

    }
    public static int[] biggerTwo(int[] a, int[] b) {
        if( (a[0]+a[1]) >=(b[0]+b[1]) ){
            return a;
        } return b;

    }
}
