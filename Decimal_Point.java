import java.util.*;

public class Decimal_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        for(int i=0; i<=n; i++) {
            if(i == 0) {
                System.out.print("0."+s);
            }
            else if(i == n) {
                System.out.print(s + ".0");
            }
            else{
                System.out.print(s.substring(0,i) + "." + s.substring(i,n));
            }

            if(i != n) {
                System.out.print(" ");
            }
        }
    }
}
