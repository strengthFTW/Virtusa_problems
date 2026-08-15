import java.util.Scanner;

public class Vowel_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans = new StringBuilder();

        String v = "";
        String c = "";

        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v += ch;
            } else {
                c += ch;
            }

        }

        for (int i = 0; i < c.length(); i++) {
            ans.append(c.charAt(i));
            ans.append(v.charAt(i));
        }
        System.out.println(ans);
        sc.close();
    }
}