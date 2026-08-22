/*  6. Split equal sum***
given an integer array A  fing the minimun index at which the array can be divided such that 
the sum of the elements on the left side is equal to the sum of elements on the right side. 
if no such idex exists return -1.

Input: Integer Array A
output: Minimun index satisfying the equal sum condition or -1 
Example: A =[1,2,3,3], output -> 2
The supplied practice document gives additional cases including [2,3,4] -> and [10.5.5] -> 0.
*/ 

public class SplitEqualSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3};

        int total = 0;
        for(int i : arr) {
            total+= i;
        }
        int leftsum = 0;
        for(int i=0; i<arr.length; i++) {
            int rightsum = total - leftsum - arr[i];

            if(leftsum == rightsum) {
                System.out.println(i);
            }
            leftsum += arr[i];
        }
    }
}
