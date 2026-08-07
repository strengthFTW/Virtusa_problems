import java.util.Scanner;
public class Xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int []prefix = new int[n];

        prefix[0] = arr[0];
        for(int i=1; i<n; i++) {
            prefix[i] = prefix[i-1] ^ arr[i];
        }
        int total = prefix[n-1];
        int ans = -1;

        for(int i=0; i<n; i++) {
            int left = prefix[i];
            int right = total ^ left;

            if(left > right) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
