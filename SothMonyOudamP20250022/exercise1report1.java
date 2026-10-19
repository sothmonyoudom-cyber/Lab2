package exercises;
import java.util.Scanner;
public class exercise1report1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Please, input your number: ");
            number = input.nextInt();
            if (number > 1000 || number < 0) {
                System.out.println("Please enter the appropriate number!");
            }
        } while (number > 1000 || number < 0);
        float sum = 0;
        for (int k = 1000; k >= number; k--) {
            sum = sum + k;
        }

        float average = sum / (1000 - number + 1);
        System.out.println("The sum of the number is " + sum +
                           " and the average of the number is " + average);
        input.close();
    }
}