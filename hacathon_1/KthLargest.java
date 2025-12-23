import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargest {

    int k;
    PriorityQueue<Integer> minHeap;

    // Constructor
    public KthLargest(int k) {
        this.k = k;
        minHeap = new PriorityQueue<>();
    }

    // Add number to the stream
    public void add(int num) {
        minHeap.add(num);

        if (minHeap.size() > k) {
            minHeap.poll();
        }
    }

    // Get K-th largest element
    public int getKthLargest() {
        if (minHeap.size() < k) {
            return -1;
        }
        return minHeap.peek();
    }

    // MAIN METHOD (Program starts here)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Create object of KthLargest
        KthLargest obj = new KthLargest(k);

        // Read number of elements in stream
        System.out.print("Enter number of elements in stream: ");
        int n = sc.nextInt();

        // Read stream elements one by one
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            obj.add(num);

            int result = obj.getKthLargest();
            if (result == -1) {
                System.out.println("Not enough elements to find " + k + "th largest");
            } else {
                System.out.println(k + "th largest element so far is: " + result);
            }
        }

        sc.close();
    }
}
