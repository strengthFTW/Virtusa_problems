import java.util.*;

public class SubNum_ClosestK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        String s = String.valueOf(N);

        long answer = Long.MAX_VALUE;
        int len = s.length();

        for (int mask = 1; mask < (1 << len); mask++) {

            String num = "";

            for (int i = 0; i < len; i++) {

                if ((mask & (1 << i)) != 0) {
                    num += s.charAt(i);
                }
            }

            long value = Long.parseLong(num);

            if (value > K) {
                answer = Math.min(answer, value);
            }
        }

        System.out.println(answer);

        sc.close();
    }
}