package serhatcode.ifelse;

import java.util.Scanner;

public class ExampleSix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = scanner.nextInt();
		
		if(number%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}

}
