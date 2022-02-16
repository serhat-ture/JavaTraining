package serhatcode.whilee;

import java.util.Scanner;

public class ExampleSix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int number= scanner.nextInt();
		int counter=1;
		int fac=1;
		
		while(counter<=number) {
			fac*=counter;
			counter++;
		}
		
		/*
		 * while(number>0){
		 * fac*=number;
		 * number--;
		 * }
		 */
		System.out.println("Factorial :"+ fac);

	}

}
