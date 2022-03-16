package serhatcode.forLoop.method;
import java.util.Scanner;

public class ExampleFour {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = scanner.nextInt();

		System.out.println("Number - " + number + " factorial - "
		+ factorial(number));

	}

	private static int factorial(long number2) {
		int result = 1;
		for (int i = 1; i <= number2; i++) {
			result *= i;
		}
		return result;
	}

}
