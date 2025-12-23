//3. Minimum window substring – Given two strings S and T, locate the smallest substring of S that 
// contains all characters of T.

import java.util.*;

public class min_window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.next();
        String sub = "";
        for (int i = 0; i < s.length(); i++) {
            String sample = "";
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    sample += s.charAt(j);
                }
                sub = sample;
                sample = " ";
            }
        }
        System.out.print(sub);
        sc.close();
    }
}
