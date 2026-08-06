/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
*/


public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i=1; i<=n; i++) {
            
            //Spaces
            for(int s=1; s<=n-i; s++) {
                System.out.print("  ");
            }
            //Descending number
            for(int j=i; j>=1; j--) {
                System.out.print(j + " ");
            }
            //Ascending number
            for(int k=2; k<=i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
