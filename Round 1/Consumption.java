public class Consumption {
    public static void main(String[] args) {
        int total = 34565;
        float con = total/1000f;
        String s = String.format("%.2f", con);
        System.out.println(s);
    }
}
