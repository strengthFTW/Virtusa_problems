public class Count_Commas{

    public static int countCommas(String input1) {
        int count = 0;
        for(int i=0; i<input1.length(); i++) {
            char ch = input1.charAt(i);
            if(ch == ',') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "123,456,789,0";
        System.out.println(countCommas(str));
    }
}