package serhatcode.whilee;

public class ExampleNine {

	public static void main(String[] args) {
		/*
		 * 
		 *          *
		 * 			**
		 * 			***
		 * 			****
		 * 			*****
		 * 			******
		 * 			*******
		 * 
		 */
		
		int number=1;
		int x;
		while(number<=7) {
			x=1;
			while(x<=number) {
				System.out.print("*");
				x++;
			}
			System.out.print("\n");
			number++;
		}

	}

}
