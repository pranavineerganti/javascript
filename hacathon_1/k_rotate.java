
//23. Rotate array by K steps in O(1) extra space – Perform rotation using reversals.
import java.util.Scanner;

public class k_rotate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("enter the elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("enter k to rotate:");
        int k = sc.nextInt();

        System.out.print("these are the elements before rotation: ");
        for (int ele : a) {
            System.out.print(ele + " ");
        }

        for (int j = 0; j < k; j++) {
            int temp = a[0];
            for (int i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            a[n - 1] = temp;
        }

        System.out.println();
        System.out.print("these are the elements after rotation: ");
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}
