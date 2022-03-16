package serhatcode.exception;

public class ExampleExpThree {

	public static void main(String[] args) {
		try {
			method1();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("Finish..");
	}

	private static void method1() throws NumberFormatException {
		String s = "abc";
		int i = Integer.parseInt(s);
	}
}
