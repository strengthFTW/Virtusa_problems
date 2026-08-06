public class Set_Bit {

    public static int setBit(int[] input1, int input2, int input3) {
        int ans = 0;
        for(int i=0; i<input2; i++) {
            if(Integer.bitCount(input1[i]) == input3) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {9,15,21,27,29,11};
        int n = 6;
        int x = 4;
        System.out.println(setBit(arr, n, x));

    }
}
