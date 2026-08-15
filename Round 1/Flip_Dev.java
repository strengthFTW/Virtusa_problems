import java.util.Scanner;

public class Flip_Dev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = -1;

        for(int i=0; i< 32; i++) {
            int new_num = n ^ (1 << i);

            if(new_num % k == 0) {
                ans = i + 1;
                break;
            }

        }
        System.out.println(ans);
        sc.close();
    }
}
