import java.util.*;
import java.io.*;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        sc.close();

        try {
            // Create a file and write the password to it
            FileWriter fw = new FileWriter("password.txt");
            fw.write(password);
            fw.close();

            //Read the password from the file
            Scanner read = new Scanner(new File("password.txt"));
            String pass = read.nextLine();
            read.close();

            //Check the Strength of the password
            String strength;
            int len = pass.length();
            if(len <= 3) {
                strength = "Weak";
            }
            else if(len >=4 && len <=7) {
                strength = "Medium";
            }
            else {
                strength = "Strong";
            }

            FileWriter fw2 = new FileWriter("evaluation.txt");
            fw2.write(strength);
            fw2.close();

            System.out.println(strength);
        }
        catch (IOException e) {
            System.out.println("An error occurred" + e.getMessage());
        }
    }
}
