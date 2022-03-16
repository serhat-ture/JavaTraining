package serhatcode.exception;

public class ExampleMultipleTryCatch {

	private static void kesir() {
		int payda = 0;
		int pay = 38 / payda;
	}

	public static void main(String[] args) {
		try {
			try {
				kesir();
			} catch (NullPointerException e) {
				System.out.println("NullPointerException catch block");	
			}
			System.out.println("try block");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException catch block");
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("Bitti Program");
	}

}
