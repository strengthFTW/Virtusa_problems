
public class Equation {

    public static int SolveEQ(int input1) {

        int n = input1;
        int ans = 0;

        int limit = (int)Math.sqrt(n);
        for(int a=1; a<=limit; a++) {
            for(int b=1; b<=limit; b++) {
                for(int c=1; c<=limit; c++) {
                    if(a*a + b*b + c*c + a*b + b*c + c*a == n) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.print(SolveEQ(n));
    }
}
