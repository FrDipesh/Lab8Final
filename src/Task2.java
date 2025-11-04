import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int favInt = InputHelper.getInt(scan, "Enter your favorite int");
        double favDouble = InputHelper.getDouble(scan, "Enter your favorite double");
        System.out.println("Your favorite Int is: " + favInt + " and your favorite double is: " + favDouble);
    }
}
