package serhatcode.exception;

public class ExampleThrow {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			method1();
		}catch(Exception e) {
			System.out.println("Exception block");
		}
		System.out.println("Finish");
	}
	private static void method1() {
		method2();
		System.out.println("Method1");
	}
	private static void method2() {
		method3();
		System.out.println("Method2");
	}
	private static void method3() {
		method4();
		System.out.println("Method3");
	}
	private static void method4() {
		System.out.println("Method4");
		throw new NullPointerException();
	}
}
