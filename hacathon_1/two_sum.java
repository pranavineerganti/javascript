
// 1st given an array and a atarget return all distinct index pairs that sum to the target.
import java.util.*;

class two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("  ");
        System.out.println("number of elements in array");
        int n = sc.nextInt();
        System.out.println("enter elements in a array");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter target sum");
        int tar = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == tar) {
                    System.out.println("[ " + a[i] + " , " + a[j] + " ]");
                }
            }
        }
        sc.close();
    }
}