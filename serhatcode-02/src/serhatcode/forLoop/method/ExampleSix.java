package serhatcode.forLoop.method;
import java.util.Scanner;

public class ExampleSix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = scanner.nextInt();
		System.out.println("Result = "+ factorial(number));

	}
	

	public static int factorial(int number) {
		if(number>0) {
			return number*factorial(number-1); //factorial(5)=5*factorial(4)
											   //factorial(4)=4*factorial(3)
		}									   //factorial(3)=3*factorial(2)
											   //factorial(2)=2*factorial(1)
											   //factorial(1)=1*factorial(0) 
											   //-> factorial(0) =1
		return 1;
	}
	
}
