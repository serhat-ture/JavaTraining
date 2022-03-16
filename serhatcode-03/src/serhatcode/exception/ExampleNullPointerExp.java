package serhatcode.exception;

public class ExampleNullPointerExp {

	public static void main(String[] args) {
		try {
			method1();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("Finish...");
	}

	public static void method1() {
		String stringVal = null;
		stringVal.charAt(0);
	}

}
