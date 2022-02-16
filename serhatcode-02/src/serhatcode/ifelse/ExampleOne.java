package serhatcode.ifelse;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner scanner = 
				new Scanner(System.in);
		
		System.out.println("First Child:");
		int firstChildAge= scanner.nextInt();
		
		System.out.println("First Child Age :"+
				firstChildAge);
		
		System.out.println("Second Child:");
		int secondChildAge= scanner.nextInt();
		
		System.out.println("Second Child Age :"+
				secondChildAge);
		
		
		//if/else kontrol yapisi
		if((firstChildAge+secondChildAge)>=30) {
			System.out.println("Greater than 30");
		}else {
			System.out.println("Less than 30");
		}
	}

}
