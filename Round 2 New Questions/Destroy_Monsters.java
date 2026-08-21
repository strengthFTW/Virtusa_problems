import java.util.*;

public class Destroy_Monsters {

    static HashMap<String, Integer> dp = new HashMap<>();

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    static int solve(ArrayList<Integer> a) {

        if (a.size() == 0)
            return 0;

        if (a.size() == 1)
            return Integer.MAX_VALUE;

        String key = a.toString();

        if (dp.containsKey(key))
            return dp.get(key);

        int n = a.size();

        int[] p = {0, n / 2, n - 1};

        int ans = Integer.MAX_VALUE;

        for (int x = 0; x < 3; x++) {

            for (int y = x + 1; y < 3; y++) {

                int i = p[x];
                int j = p[y];

                if (i == j)
                    continue;

                int cost = gcd(a.get(i), a.get(j));

                ArrayList<Integer> next = new ArrayList<>(a);

                next.remove(Math.max(i, j));
                next.remove(Math.min(i, j));

                int result = solve(next);

                if (result != Integer.MAX_VALUE) {
                    ans = Math.min(ans, cost + result);
                }
            }
        }

        dp.put(key, ans);

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(solve(a));

        sc.close();
    }
}