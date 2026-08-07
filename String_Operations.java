import java.util.*;
public class String_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m = sc.nextInt();

        char [] arr = s.toCharArray();

        for(int i=0; i<m; i++) {
            int op = sc.nextInt();

            if(op == 1) {
                char temp = arr[0];
                arr[0] = arr[arr.length-1];
                arr[arr.length-1] = temp;
            }
            else {
                int n = arr.length;
                for(int j=0; j<n/2; j++) {
                    char temp = arr[j];
                    arr[j] = arr[j+n/2];
                    arr[j+n/2] = temp;
                }
            }
        }
        System.out.println(new String(arr));
        sc.close();
    }
}