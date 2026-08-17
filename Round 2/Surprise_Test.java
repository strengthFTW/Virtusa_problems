import java.util.*;
public class Surprise_Test {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            long n = Long.parseLong(s);
            
            HashSet<Long> nonspecial = new HashSet<>();

            for(long i=2; i*i <=n; i++) {

                long power = i*i;

                while(power <=n) {
                    nonspecial.add(power);

                    if(power > n / i) {
                        break;
                    }
                    else{
                        power = power * i;
                    }
                }
            }
            long answer = n - nonspecial.size();
            System.out.println(answer);
            sc.close();

    }
}
