import java.util.*;

public class River_current {

    public static int[] riverCurrent (int input1, int [] input2) {

        int n = input1;
        int [] ans = input2.clone();
        
        for(int i=0; i<n; i++) {
            if(input2[i] != 0) {
                continue;
            }
            int l = i-1;
            int r = i+1;

            while(l>=0 && input2[l] == 0) {
                l--;
            }

            while(r<n && input2[r] == 0) {
                r++;
            }

            if(l<0 && r>=n) {
                ans[i] = 0;
            }
            else if(l<0) {
                ans[i] = input2[r];
            }
            else if(r>=n) {
                ans[i] = input2[l];
            }
            else{
                ans[i] = Math.abs(input2[l]) >= Math.abs(input2[r]) ? input2[l] : input2[r];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2,0,-3,0,5};
        System.out.println(Arrays.toString(riverCurrent(n, arr)));
    }
}
