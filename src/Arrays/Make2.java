package Arrays;

import java.util.Arrays;

public class Make2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(make2(new int[]{4,5}, new int[]{1,2,3})));
    }
    public static int[] make2(int[] a, int[] b) {
        if(a.length >0 && a.length >2){
            int[] c = new int[2];
            c[0]=a[0];
            c[1]= a[1];
            return c;
        }else if(a.length == 0 && b.length >=2){
            int[] c = new int[2];
            c[0]=b[0];
            c[1]=b[1];
            return c;
        }else if(a.length == 1){
            int[] c = new int[2];
            c[0]=a[0];
            c[1]= b[0];
            return c;
        }return a;
    }


}
