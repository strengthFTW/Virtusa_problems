import java.util.Scanner;

public class Shopping_cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(z % 2 !=0) {
            z++;
        }

        int four_Pack = z / 4;
        int remain = z % 4;

        int cost = four_Pack * y;

        if(remain == 2) {
            cost = cost + x;
        }

        System.out.println(cost);
        sc.close();
    }
}
