package serhatcode.exception;

public class ExampleThrows {

	public static void main(String[] args) {
	    method1();
	    method2();
	}
	
	private static void method1(){
		String stringVal = null;
		stringVal.toString();
	}
	
	private static void method2() 
			throws ArithmeticException{
		throw new ArithmeticException();
	}

}
