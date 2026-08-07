import java.util.Scanner;

public class Knight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = {4,3,5,2,1};

        int ans = 0;

        for(int i=0; i<n; i++) {
            int leftstrong = 0;
            int rightstrong = 0;

            for(int left=0; left<i; left++) {
                if(arr[left] > arr[i]) {
                    leftstrong++;
                }
            }
            for(int right=i+1; right<n; right++) {
                if(arr[right] > arr[i]) {
                    rightstrong++;
                }
            }
            if(leftstrong > rightstrong) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
