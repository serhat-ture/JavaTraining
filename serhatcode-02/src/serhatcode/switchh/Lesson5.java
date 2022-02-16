package serhatcode.switchh;

import java.util.Scanner;

public class Lesson5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayi Giriniz:");
		int number = scanner.nextInt();
		int result = number%2==0 ? 1 : 0;
		//int result = sayi<0?-1:(sayi%2==0 ? 1 : 0)
		switch(result) {
		case 1:
			System.out.println("Sayi Cifttir");
			break;
		case 0:
			System.out.println("Sayi Tektir");
			break;
		default :
			System.out.println("Yanlis Islem");
		}

	}

}
