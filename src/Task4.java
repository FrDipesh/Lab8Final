import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        boolean notDone = false;

        do {
            double priceOfItem = InputHelper.getRangedDouble(scan, "What is the price of your item?",0.50,10);
            total += priceOfItem;
            scan.nextLine();
            String moreItems = InputHelper.getYNConfirm(scan, "Do you have more items? If so [Y] for Yes and [N] for no: ");
            if (moreItems.equalsIgnoreCase("y")) {
                notDone = true;
            } else if (moreItems.equalsIgnoreCase("n")) {
                notDone = false;
            }
        } while (notDone);
        System.out.println("Total Cost in $: " + total);

    }
}
