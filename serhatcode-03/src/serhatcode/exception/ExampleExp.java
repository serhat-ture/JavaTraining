package serhatcode.exception;

public class ExampleExp {

	public static void main(String[] args) {
		try {
		  method1();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Finish...");
	}
	
	public static void method1() {
		int [] myNumbers = {1,2,3};
		System.out.println(myNumbers[10]);
	}

}
