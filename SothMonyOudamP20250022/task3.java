package exercises;
import java.util.Scanner;
public class task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.println("Please input 5 numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int max = a;
		int min = a;
		if (a >= b && a >= c && a >= d && a>=e) {
			max = a;
		}
		else if (b >= a && b >= c && b >= d && b >= e) {
			max = b;
		}
		else if (c >= a && c >= b && c >= d && c >= e) {
			max = c;
		}
		else if (d >= a && d >= b && d >= c && d >= e) {
			max = d;
		}
		else {
			max = e;
		}
		if (a <= b && a <= c && a <= d && a<=e) {
			min = a;
		}
		else if (b <= a && b <= c && b <= d && b <= e) {
			min = b;
		}
		else if (c <= a && c <= b && c <= d && c <= e) {
			min = c;
		}
		else if (d <= a && d <= b && d <= c && d <= e) {
			min = d;
		}
		else {
			min = e;
		
	}
		System.out.println("The maximum of the digits is " + max + " and the minimum of the digits is " +min);
		input.close();
	}
}