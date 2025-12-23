
//24. Validate IP address (IPv4 & IPv6) – Return “IPv4”, “IPv6” or “Invalid”
import java.util.*;

public class ip {

    public static String validateIP(String IP) {
        if (IP.contains(".")) {
            return isIPv4(IP) ? "IPv4" : "Invalid";
        } else if (IP.contains(":")) {
            return isIPv6(IP) ? "IPv6" : "Invalid";
        } else {
            return "Invalid";
        }
    }

    private static boolean isIPv4(String ip) {
        String[] parts = ip.split("\\.", -1);
        if (parts.length != 4)
            return false;

        for (String part : parts) {
            if (part.isEmpty() || part.length() > 3)
                return false;
            if (part.length() > 1 && part.charAt(0) == '0')
                return false;
            for (char c : part.toCharArray()) {
                if (!Character.isDigit(c))
                    return false;
            }
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255)
                return false;
        }

        return true;
    }

    private static boolean isIPv6(String ip) {
        String[] parts = ip.split(":", -1);
        if (parts.length != 8)
            return false;

        for (String part : parts) {
            if (part.isEmpty() || part.length() > 4)
                return false;
            for (char c : part.toCharArray()) {
                boolean isHex = (c >= '0' && c <= '9') ||
                        (c >= 'a' && c <= 'f') ||
                        (c >= 'A' && c <= 'F');
                if (!isHex)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an IP address:");
        String ip = sc.nextLine().trim();

        String result = validateIP(ip);
        System.out.println("Result: " + result);
        sc.close();
    }
}
          