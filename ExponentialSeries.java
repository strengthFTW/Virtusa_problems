import java.util.ArrayList;

public class ExponentialSeries {
        public static ArrayList<Integer> generateSeries(int A1, int R, int Z) {
        ArrayList<Integer> list = new ArrayList<>();

        int current = A1;

        while (current <= Z) {
            list.add(current);

            if (R == 1 || R == 0) break; // avoid infinite loop

            current = current * R;
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = generateSeries(2, 1, 100);
        System.out.println(result);
    }
}
