import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = InputHelper.getNonZeroLenString(scan, "Enter your name." );
        System.out.println("The username you entered is: " + name);
    }
}
