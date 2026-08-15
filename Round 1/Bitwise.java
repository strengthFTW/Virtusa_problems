import java.util.*;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalXor = 0;
        for (int x : arr) totalXor ^= x;

        int prefixXor = 0;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            prefixXor ^= arr[i];
            int suffixXor = totalXor ^ prefixXor;

            if (prefixXor > suffixXor) {
                ans = i;
                break; // or remove if multiple allowed
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
