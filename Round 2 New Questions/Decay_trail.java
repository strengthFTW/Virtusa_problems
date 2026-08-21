import java.util.Scanner;

public class Decay_trail {
    static int n,m;

    static int[][] grid;
    static int[][] dp;

    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};

    public static int dfs(int r, int c) {
        
        if(dp[r][c] != 0) {
            return dp[r][c];
        }

        int max = 1;

        for(int i=0; i<4; i++) {

            int mr = r + dr[i];
            int mc = c + dc[i];

            if(mr >= 0 && mr < n && mc >=0 && mc < m && grid[mr][mc] < grid[r][c]) {
                max = Math.max(max,1+dfs(mr,mc));
            }
        }
        dp[r][c] = max;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        grid = new int[n][m];
        dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(dfs(x, y));

        sc.close();
    }
}
