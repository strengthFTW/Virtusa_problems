    import java.util.Scanner;

    public class Max_Reward {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int [] dp = new int[n];
            dp[0] = Math.max(0,arr[0]);
            for(int i=1; i<n; i++) {
                int take = arr[i];

                if(arr[i-1] <0) {
                    take+=arr[i-1];
                }
                if(i >=2) {
                    take+= dp[i-2];
                }
                int skip = dp[i-1];
                dp[i] = Math.max(take,skip);
            }
            System.out.println(dp[n-1]);
            sc.close();
        }

    }
