import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = InputHelper.getRangedInt(scan,"Enter the year your born form 1950-2010", 1950,2010);
        int month = InputHelper. getRangedInt(scan,"Enter the month you were born",1,12);
        if (month == 1 || month == 3 || month == 5 || month == 8 || month == 10 || month == 12){
            int day = InputHelper. getRangedInt(scan,"Enter your day you were born",1,31);
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            int day = InputHelper. getRangedInt(scan,"Enter your day you were born",1,30);
        }
        int hour = InputHelper. getRangedInt(scan,"Enter the day you were born",1,24 );
        int minute = InputHelper. getRangedInt(scan,"Enter the minute you were born",1,59 );
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
    }
}
