package exercises;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Input n: ");
        n = input.nextInt();
        System.out.print("All prime numbers from 2 to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}