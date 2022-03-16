package serhatcode.forLoop;

public class ExampleFour {

	// 6 ile 50 arasýnda 3 ile bölümünden kalan 2 olan sayýlar kümesinden
	// çift olanlarýn çarpýmý
	public static void main(String[] args) {
		long result = 1;
		/*
		 * for(int i =6;i<=50;i++) { if(i%3==2 && i%2==0) { //if(i%2==0) { result*=i; }
		 * } }
		 */

		for (int i = 6; i <= 50; i++)
			if (i % 3 == 2 && i % 2 == 0)
				result *= i;
		System.out.println("result " + result);
		

	}

}
