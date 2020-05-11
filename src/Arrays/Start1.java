package Arrays;

public class Start1 {
    public static void main(String[] args) {
        System.out.println(start1(new int[] {1,2,3},new int[] {1,3}));
        System.out.println(start1(new int[] {7,2,3},new int[] {1}));
        System.out.println(start1(new int[] {1,2},new int[] {}));
    }

    public static int start1(int[] a, int[] b) {
        int temp =0;
        if (a.length >=1 && a[0]==1) temp++;
        if (b.length >=1 &&b[0] ==1) temp++;
        return temp;

    }
}
