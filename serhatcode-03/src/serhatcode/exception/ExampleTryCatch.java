package serhatcode.exception;

public class ExampleTryCatch {
	
	private static void kesir() {
		int payda = 0;
		int pay = 38 / payda;
		System.out.println("Bitti method");
	}
	
	public static void main(String[] args) {
		/*
		 * int payda=0; int pay = 38/payda;
		 */

//		int payda=0;
//		int pay;
//		try {
//			pay=38/payda;
//		}catch (ArithmeticException e) {
//			pay=1;
//		}
//		System.out.println("Pay : "+pay);
		
		try {
		  kesir();
		}catch (ArithmeticException e) {
		}
		System.out.println("Bitti Program");
	}



}
