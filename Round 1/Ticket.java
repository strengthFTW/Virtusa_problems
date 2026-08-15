import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n+1];

        for(int i=0; i<=n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        int john = arr[n];

        for(int i=0; i<n; i++) {
            int diff = arr[i] ^ john;
            if(Integer.bitCount(diff) <= k) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
