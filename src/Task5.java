import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ssn = InputHelper.getRegExString(scan,
                "Enter your SSN (###-##-####):",
                "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + ssn);

        String mNum = InputHelper.getRegExString(scan,
                "Enter your M number (M#####):",
                "[Mm]\\d{5}");
        System.out.println("Your M Number is: " + mNum);

        System.out.println("Menu: O - Open    S - Save    V - View    Q - quit");
        String menuChoice = InputHelper.getRegExString(scan,
                "Choose an option:",
                "[OoSsVvQq]");

        System.out.println("You chose: " + menuChoice);
    }
}
