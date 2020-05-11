package Arrays;

import java.util.Arrays;

public class Front11 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(front11(new int[]{1, 2, 3}, new int[]{7, 3})));
    }

    public static int[] front11(int[] a, int[] b) {

            if(a.length == 0 && b.length == 0){
                return a;
            }

            if (a.length ==0 ){
                int[] front = new int[]{b[0]};
                return front;
            }else if (b.length ==0 ){
                int[] front = new int[]{a[0]};
                return front;
            }else{
                int[] front = new int[]{a[0],b[0]};
                return front;
            }

    }
}