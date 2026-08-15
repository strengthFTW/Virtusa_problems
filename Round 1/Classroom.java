import java.util.Arrays;

public class Classroom {

    public static int[] findorder(int n, int[] arr) {
        boolean[] occupied = new boolean[n+1];
        int result[] = new int[n];

        for(int i=0; i<n; i++) {
            int seat = arr[i];

            while(occupied[seat]) {
                seat++;
                if(seat > n) {
                    seat = 1;
                }
            }
            occupied[seat] = true;
            result[i] = seat;
        }
        return result;

    }
    
    public static void main(String[] args) {
        int n = 3;
        int [] arr = {2,2,3};
        int [] res = findorder(n,arr);
        System.out.println(Arrays.toString(res));
    }
}
