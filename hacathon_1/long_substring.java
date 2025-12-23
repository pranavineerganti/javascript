
// 2nd longest substring without reapaeating characters.find the maximum length of a substring 
//that contain no repeating characters.
import java.util.*;

public class long_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("enter the string :");
        String a = sc.next();
        int n = a.length();
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = i; j < n; j++) {
                boolean repeated = false;

                for (int k = i; k < j; k++) {
                    if (a.charAt(j) == a.charAt(k)) {
                        repeated = true;
                        break;
                    }
                }

                if (repeated)
                    break;

                count++;
            }

            if (count > maxLength)
                maxLength = count;
        }

        System.out.println(maxLength);
        sc.close();
    }
}
