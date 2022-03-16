package serhatcode.forLoop.method;
import java.util.Scanner;

public class ExampleSeven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		print("Enter Number1:");
		int number1= scanner.nextInt();
		
		print("Enter Number2:");
		int number2= scanner.nextInt();
		
		print("Enter Operand(+,-,/,*):");
		char operand= scanner.next().charAt(0);
		
		switch (operand) {
		case '+':
			print(sum(number1, number2));
			break;
		case '-':
			print(diff(number1, number2));
			break;
		case '/':
			print(divide(number1, number2));
			break;
		case '*':
			print(multiply(number1, number2));
			break;
		default:
			print("Error");
			break;
		}
	}
	
	private static int sum(int a , int b) {
		return a+b;
	}
	
	private static int multiply(int a, int b) {
		return a*b;
	}
	
	private static float divide(int a, int b) {
		return (float)a/b;
	}
	
	private static int diff(int a, int b) {
		return a-b;
	}
		
	private static void print(float result) {
		System.out.println("Result : "+ result);
	}
	
	private static void print(String stringVal) {
		System.out.println(stringVal);
	}
}
