/*
Given integers n and k, construct an array containing
numbers 1 to n exactly once with exactly k inversions.

An inversion is a pair (i, j) where:
i < j and arr[i] > arr[j].

Example:

Input:
n = 4
k = 5

One valid output:
[4, 3, 1, 2]

Inversions:
4 > 3
4 > 1
4 > 2
3 > 1
3 > 2

Total inversions = 5
*/
import java.util.*;
public class Inversion {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N :");
        int n = sc.nextInt();
        
        System.out.print("Enter K :");
        int k = sc.nextInt();
        
        
        int start = 1;
        int end = n;

        for(int i=1; i<=n; i++) {
            if(k >= (end - start)) {
                list.add(end);
                k = k- (end - start);
                end--;
            }
            else{
                list.add(start);
                start++;
            }
        }
        System.out.println(list);
        sc.close();
    }
}