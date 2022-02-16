package serhatcode.whilee;

public class ExampleEight {

	public static void main(String[] args) {
		int x;
		int y = 4;

		while (y > 0) {
			x= 10;
			System.out.print("\t");
			while (x > 0) {
				System.out.print("*");
				x--;
			}
			System.out.print("\n");
			y--;
		}

	}

}
