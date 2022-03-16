package serhatcode.exception;

public class ExampleTryCatchFinally {
	private static void kesir() {
		int payda = 0;
		int pay = 38 / payda;
	}

	public static void main(String[] args) {
		try {
			kesir();
			System.out.println("try block");
		} catch (NullPointerException nullPointerException) {
			System.out.println("NullPointerException catch block");
		}catch (ArithmeticException arithmeticException) {
			System.out.println("ArithmeticException catch block");
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("Bitti Program");
	}

}
