import java.util.*;
public class Lego_String {
    public static void main(String[] args) {
        String wall = "barfoothefoobar";
        String[] B = {"foo", "bar"};

        System.out.println(findLego(wall, B));
    }

    public static List<Integer> findLego(String wall, String[] B) {

        List<Integer> result = new ArrayList<>();

        int wordslength = B[0].length();
        int wordscount = B.length;
        int totallength = wordslength * wordscount;

        HashMap<String,Integer> required = new HashMap<>();

        for(String word : B) {
            required.put(word,required.getOrDefault(word,0)+1);
        }

        for(int start=0; start <= wall.length()-totallength; start++) {

        HashMap<String,Integer> found = new HashMap<>();

            int count = 0;

            while(count < wordscount) {
                int index = start + count * wordslength;
                String word = wall.substring(index,index+wordslength);

                if(!required.containsKey(word)) {
                    break;
                }
                found.put(word,found.getOrDefault(word,0)+1);

                if(found.get(word) > required.get(word)) {
                    break;
                }
                count++;
            }
            if(count == wordscount) {
                result.add(start);
            }
        }
        if(result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}