package serhatcode.forLoop.method;
import java.util.Scanner;

public class ExampleThree {

	public static void main(String[] args) {
		System.out.println("Result : " + islem());

	}

	private static float islem() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen yapmak istediginiz islemi seciniz");
		char choose = scanner.next().charAt(0);
		float number = 10;
		float number2 = 2;
		float result;
		if (choose == 'b') {
			result = number / number2;
			return result;
		} else if (choose == 'c') {
			result = number * number2;
			return result;
		} else {
			result = -1;
			return result;

		}
	}

}
