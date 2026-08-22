/*
5. Balance Substring ***
you are given a string S consisting only of the characters a and b. You need to identify the longest contigous substring in which the number of occurrences of a is exactly equal to the number of occcurrences of b.

return thr length of this longest balances substring, If no such substring exists, return 0.

Input : A string S containing only a and b
output: Length of longest substring containing an equal number of a's and b's.
Example:  S = "abbaab" -> output: 6
The complete string contains three a's and three b's so its longest balanced substring has length 6. */
import java.util.*;
public class BalanceSubstring {
    public static void main(String[] args) {
        String s = "abbaab";
        int sum=0;
        int maxlength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'a') {
                sum++;
            }
            else{
                sum--;
            }
            if(map.containsKey(sum)) {
                int length = i-map.get(sum);
                maxlength = Math.max(maxlength,length);
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println(maxlength);
    }
    
}
