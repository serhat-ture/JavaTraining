package serhatcode.ifelse;

import java.util.Scanner;

public class ExampleSeven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int number= scanner.nextInt();
		
		String stringVal= (number>10)?"number greater than 10" 
				:"number less than 10";
		
		int intVal = (number>10)? number : 10;
		
		/*
		if(number>10) {
			stringVal="number greater than";
		}else {
			stringVal="number less than";
		}
		*/
		System.out.println("String val : "+ stringVal);

	}

}
