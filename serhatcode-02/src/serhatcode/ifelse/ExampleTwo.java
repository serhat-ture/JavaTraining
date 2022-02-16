package serhatcode.ifelse;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		Scanner scanner = 
				new Scanner(System.in);
		
		System.out.println("First Child Age:");
		int firstChildAge = 
				scanner.nextInt();
		
		System.out.println("Second Child Age:");
		int secondChildAge = 
				scanner.nextInt();
		
		//if/else/elseif kontrol
		if(firstChildAge>secondChildAge) {
			System.out.println
			("FirstChild is greater");
		}
		else if (secondChildAge>firstChildAge) 
		{
			System.out.println(
					"SecondChild is greater");
		}else {
			System.out.println(
					"Equals");
		}
		System.out.println("Finish!!");
	}

}
