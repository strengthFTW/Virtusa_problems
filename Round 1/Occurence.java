import java.util.*;
public class Occurence {
    public static void main(String[] args) {
        int count = 0;

        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        char ch[] = {'a', 'b', 'c', 'd', 'e', 'a', 'b', 'c', 'd', 'e'};     

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();   
        
        for(int i : arr) {
            map1.put(i,map1.getOrDefault(i, 0) + 1);
        }
        
        for(char c : ch) {
            map2.put(c,map2.getOrDefault(c, 0) + 1);
        }

        for(int n: map1.keySet()) {
            for(char c: map2.keySet()) {
                if(map1.get(n) == map2.get(c)) {
                    count++;
                }
            }
        }
        System.out.println("Number of common elements: " + count);
    }
}