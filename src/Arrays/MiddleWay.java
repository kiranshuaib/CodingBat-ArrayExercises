package Arrays;
/*

Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
 */

import java.util.Arrays;

public class MiddleWay {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(middleWay(new int[] {1,2,3},new int[] {4,5,6})));
        System.out.println(Arrays.toString(middleWay(new int[] {7,7,7,},new int[] {3,8,0})));
        System.out.println(Arrays.toString(middleWay(new int[] {5,2,9},new int[] {1,4,5})));
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] middleWayArr = new int []{a[1],b[1]};
        return middleWayArr;
    }

}
