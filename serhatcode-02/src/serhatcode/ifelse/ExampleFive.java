package serhatcode.ifelse;

import java.util.Scanner;

public class ExampleFive {

	public static void main(String[] args) {
		Scanner scannerBuilder = new Scanner(System.in);

		System.out.println("First number:");
		int firstNumber = scannerBuilder.nextInt();

		System.out.println("Second number:");
		int secondNumber = scannerBuilder.nextInt();

		System.out.println("Third number:");
		int thirdNumber = scannerBuilder.nextInt();
		// ilk sayi ikinci sayi
		// ilk sayi ucuncu sayi
		// 30 20 20
		/*
		 * if (firstNumber != secondNumber && firstNumber != thirdNumber && thirdNumber
		 * != secondNumber) { System.out.println("Running");
		 **/
		if (firstNumber == secondNumber || firstNumber == thirdNumber 
				|| thirdNumber == secondNumber) {
			System.out.println("Equals Error");
		} else if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println("First Number is greater than");
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println("Second Number is greater than");
		} else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
			System.out.println("Third Number is greater than");
		} else {
			System.out.println("Error!");
		}
		
	}

}
