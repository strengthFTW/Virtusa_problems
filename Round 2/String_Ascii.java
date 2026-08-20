public class String_Ascii {
    public static void main(String[] args) {
        String s1 = "stone";
        String s2 = "longest";

        int m = s1.length();
        int n = s2.length();

        if(m<n) {
            System.out.println(checkString(s1,s2));
        }
        else{
            System.out.println(checkString(s2,s1));
        }
    }

    public static int checkString(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int [][] arr = new int[m+1][n+1];

        int max = 0;
        int index = 0;
        int sum = 0;

        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    arr[i][j] = arr[i-1][j-1] + 1;
                    
                    if(arr[i][j] > max) {
                        max = arr[i][j];
                        index = i-1;
                    }
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }
        if(max > 0) {
            for(int k=index-max+1; k <= index; k++) {
                sum += s1.charAt(k);
                System.out.println(s1.charAt(k) + ":" + (int)s1.charAt(k));
            }
        }

        return sum;
    }
}