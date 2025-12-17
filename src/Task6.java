import java.util.Scanner;

public class Task6 {
     public static double celsiusToFahrenheit(double c) {
         return  (c * 9 / 5) + 32;
     }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double c = InputHelper.getDouble(scan, "Enter temp in Celsius: ");
        double f = celsiusToFahrenheit(c);

        System.out.printf("Temp in Fahrenheit: %.2f%n", f);
    }
}
