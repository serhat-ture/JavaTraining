package serhatcode.exception;
import java.util.Scanner;

public class ExampleExpTwo {
	// kullan�c�dan bir ya� al�n
	// 18 den k���k ise exp
	// 18 den b�y�k ise syso Yetkili giri�
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yas Giriniz:");
		int age = scanner.nextInt();
		try {
			method1(age);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Bitti");
	}

	public static void method1(int age) {
		if (age < 18)
			throw new 
			ArithmeticException("Yetkisiz Yas");
		else
			System.out.println("Yetkili Yas");
	}

}
