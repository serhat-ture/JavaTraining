package serhatcode.forLoop.method;

public class ExampleFive {

	public static void main(String[] args) {
		int number=10;
		int number2=15;
		int number3=20;
		
		System.out.println("Sum 1 :"+ sum(number,number2));
		System.out.println("Sum 2 :"+ sum(number,number2,number3));
	}
	
	private static int sum(int a, int b) {
		return a+b;
	}
	
	private static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	private static float sum (float a, float b) {
		return a+b;
	}
	
	private static float sum(float a,int b) {
		return  (a+b);
	}

}
