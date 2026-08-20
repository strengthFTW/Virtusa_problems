/*
Given a string containing lowercase letters and digits,
count the number of continuous digit substrings where:

1. The character immediately before the digits is a lowercase letter.
2. The character immediately after the digits is also a lowercase letter.

Example:
Input:  "a123b9c88d1e"

Valid digit substrings:
123
9
88
1

Output: 4
*/
import java.util.*;
public class Numerical_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check_numericals(s));
    }

    public static int check_numericals(String s) {
        int count = 0;
        int i = 0;
        int n = s.length();
        while(i < n) {
            
            if(Character.isDigit(s.charAt(i))) {
                int start = i;

                while(i < n && Character.isDigit(s.charAt(i))) {
                    i++;
                }
                int end = i-1;

                if(start > 0 && end+1 <=n && 
                    Character.isLowerCase(s.charAt(start-1)) && Character.isLowerCase(s.charAt(end+1))) {
                        count++;
                }
            }
            else{
                i++;
            }
        }
        return count;
    }
}
