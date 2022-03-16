package serhatcode.exception;

public class ExampleTryCatchFinallyTwo {

	private static void kesir() {
		int payda = 0;
		int pay = 38 / payda;
	}

	public static void main(String[] args) {
		try {
			kesir();
			System.out.println("try block");
		} catch (Exception e) {
			System.out.println("Exception catch block");
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("Bitti Program");
	}


}
