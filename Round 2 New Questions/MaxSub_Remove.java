import java.util.*;
public class MaxSub_Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = arr[0];
        for(int i=1; i<n; i++) {
            prefix[i] = prefix[i-1] | arr[i];
        }
        suffix[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            suffix[i] = suffix[i+1] | arr[i];
        }
        int total = prefix[n-1];
        int ans = 0;

        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {

                int left = 0;
                int right = 0;

                if(i>0) {
                    left = prefix[i-1];
                }
                if(j<n-1) {
                    right = suffix[j+1];
                }

                int remaining = left | right;
                
                if(remaining == total) {
                    ans = Math.max(ans,j-i+1);
                }
                
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
