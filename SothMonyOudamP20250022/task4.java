package exercises;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input date (yyyy-mm-dd): ");
        String date = input.nextLine();
        boolean valid = true;
        if (date.length() != 10 || date.charAt(4) != '-' || date.charAt(7) != '-') {
            valid = false;
        } else {
            int year = (date.charAt(0) - '0') * 1000
                     + (date.charAt(1) - '0') * 100
                     + (date.charAt(2) - '0') * 10
                     + (date.charAt(3) - '0');
           int month = (date.charAt(5) - '0') * 10 + (date.charAt(6) - '0');
            int day = (date.charAt(8) - '0') * 10 + (date.charAt(9) - '0');
            if (month < 1 || month > 12) {
                valid = false;
            }
            if (day < 1 || day > 31) {
                valid = false;
            }
            if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                valid = false;
            }
            if (month == 2) {
                if (day > 29) {
                    valid = false;
                }
                if (day == 29 && (year % 400 != 0 && (year % 4 != 0 || year % 100 == 0))) {
                    valid = false;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (i != 4 && i != 7 && (date.charAt(i) < '0' || date.charAt(i) > '9')) {
                    valid = false;
                }
            }
        }
        if (valid) {
            System.out.println("Valid date");
        } else {
            System.out.println("Invalid date");
        }
        input.close();
    }
}