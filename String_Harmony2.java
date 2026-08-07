// for string if it harmony starts from any index like aaababc


import java.util.Scanner;

public class String_Harmony2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int ans = 0;

        for (int start = 0; start < s.length(); start++) {

            int index = start;
            int length = 0;

            for (char last = 'b'; last <= 'z'; last++) {
                boolean ok = true;

                for (char c = 'a'; c <= last; c++) {
                    if (index >= s.length() || s.charAt(index) != c) {
                        ok = false;
                        break;
                    }
                    index++;
                }
                if (!ok) {
                    break;
                }
                length = index - start;
            }
            ans = Math.max(ans, length);
        }
        System.out.println(ans);
    }
}