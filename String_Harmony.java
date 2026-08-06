import java.util.Scanner;
public class String_Harmony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // ab abc abc
        int index = 0;
        int ans = 0;

        for(char i='b'; i<='z'; i++) {
            for(char j='a'; j<=i; j++) {

                if(index >= s.length() || s.charAt(index) != j) {
                    System.out.println(ans);
                    return;
                }
                index++;
            }
            ans = index;

        }
        System.out.println(ans);
        sc.close();
    }
}
