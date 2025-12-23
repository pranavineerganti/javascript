//7. Maximum sum subarray with at most K negative numbers – 
// Find the largest sum subarray that contains no more than K negative elements.

import java.util.*;

public class max_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("  ");
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        System.out.println("enter the elements in array");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("enter how many negative numbers it can contain:");
        int k = sc.nextInt();

        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int negnum = 0;

            for (int j = i; j < n; j++) {
                sum += a[j];

                if (a[j] < 0) {
                    negnum++;
                }

                if (negnum <= k) {
                    if (sum > max_sum) {
                        max_sum = sum;
                    }
                } else {
                    break;
                }
            }
        }

        System.out.print(max_sum);
        sc.close();
    }
}
