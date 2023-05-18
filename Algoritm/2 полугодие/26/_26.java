import java.util.Scanner;
public class _26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        String longPalindrome = longPalindrome(string);
        System.out.println("Длинейший палиндром: " + longPalindrome);
    }

    public static String longPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int len = str.length();
        boolean[][] dp = new boolean[len][len];
        int maxLen = 0;
        int startIndex = 0;

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
            maxLen = 1;
        }

        for (int i = 0; i < len - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                dp[i][i+1] = true;
                maxLen = 2;
                startIndex = i;
            }
        }

        
        for (int y = 3; y <= len; y++) {
            for (int i = 0; i < len - y + 1; i++) {
                int j = i + y - 1;
                if (str.charAt(i) == str.charAt(j) && dp[i+1][j-1]) {
                    dp[i][j] = true;
                    if (y > maxLen) {
                        maxLen = y;
                        startIndex = i;
                    }
                }
            }
        }

        return str.substring(startIndex, startIndex + maxLen) + " (" + maxLen + ")";
    }
}

