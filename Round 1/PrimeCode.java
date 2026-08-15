import java.util.Arrays;

public class PrimeCode {

    static int primeCount(int num) {
        int count = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }

            num = num / 10;
        }

        return count;
    }
    public static void main(String[] args) {


        int n = 4;
        int[] a = {123, 45, 67, 89};

        Integer [] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }

        Arrays.sort(arr,(x,y)-> {
            int cx = primeCount(x);
            int cy = primeCount(y);

            if (cx != cy) {
                return cx - cy;
            } else {
                return x - y;
            }
        });
        
    }
}
