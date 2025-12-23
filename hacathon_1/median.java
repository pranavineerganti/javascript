
//Find median of two sorted arrays – O(log (min(m,n))) solution for two large arrays.
import java.util.*;

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("enter the size of first array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements in first array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("enter the size of second array :");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("enter the elements in second array: ");
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }

        int[] c = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);
        int s = c.length;
        if (s % 2 == 0) {
            double median = (c[s / 2 - 1] + c[s / 2]) / 2.0;
            System.out.println("Median = " + median);
        } else {
            System.out.println("Median = " + c[s / 2]);
        }
        sc.close();

    }
}
