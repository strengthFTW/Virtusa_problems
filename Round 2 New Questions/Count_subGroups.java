/*
4. Count Subsets
Problem DescripƟon:
Given an array of posiƟve integers, determine the minimum number of groups/subarrays required
so that the elements can be arranged within each group such that every element is located at a 1-
based index less than or equal to its value.
The elements may be rearranged.
In other words, for every resulƟng group, aŌer suitable rearrangement, the value occupying posiƟon
i must saƟsfy:
i ≤ value
Input: An array of posiƟve integers.
Output: Minimum number of groups/subarrays required. 
Example:
N = 5
A = [5,5,5,1,2]
Output: 1
The document notes that the original descripƟon is terse and that the test cases follow the
interpretaƟon that the array can be divided into the minimum number of independently valid
groups.*/
import java.util.*;
public class Count_subGroups {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,1,1};
        int count = 0;
        int group = 1;

        Arrays.sort(arr);
        for(int x : arr) {
            if(x >= count+1) {
                count++;
            }
            else{
                group++;
                count = 1;
            }
        }
        System.out.println(group);
    }
}
