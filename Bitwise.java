import java.util.*;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total |= arr[i];
        }

        int ans = 0;
        for (int l = 0; l < n; l++) {
            int leftor = 0;

            for (int i = 0; i < l; i++) {
                leftor |= arr[i];
            }
            
            for (int r = l; r < n; r++) {
                int temp = leftor;
                for (int i = r + 1; i < n; i++) {
                    temp |= arr[i];
                }
                if (temp == total) {
                    ans = Math.max(ans, r - l + 1);
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
