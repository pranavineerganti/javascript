//17. Maximum product subarray with zeros – Subarray product may be zero;
//  return the maximum product achievable.

import java.util.*;

public class max_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("enetr size of the array:");
        int n = sc.nextInt();
        System.out.println("enter the elements in array:");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max_prod = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = i; j < n; j++) {
                prod *= a[j];
                if (max_prod < prod) {
                    max_prod = prod;
                }
            }
        }
        System.out.print(max_prod);
        sc.close();
    }
}
