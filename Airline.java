import java.util.*;

class UserMainCode {

    public int[] theShuffle(int input1, int[] input2) {

        Integer[] idx = new Integer[input1];

        for (int i = 0; i < input1; i++)
            idx[i] = i;

        Arrays.sort(idx, new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {

                String r1 = new StringBuilder(String.valueOf(input2[i])).reverse().toString();
                String r2 = new StringBuilder(String.valueOf(input2[j])).reverse().toString();

                int cmp = r1.compareTo(r2);

                if (cmp != 0)
                    return cmp;

                return Integer.compare(i, j);
            }
        });

        int[] ans = new int[input1];

        for (int i = 0; i < input1; i++)
            ans[i] = input2[idx[i]];

        return ans;
    }
        public static void main(String[] args) {
        int n = 4;
        int [] arr = {221,321,456,1111};
        System.out.println(Arrays.toString(new UserMainCode().theShuffle(n, arr)));
    }
}