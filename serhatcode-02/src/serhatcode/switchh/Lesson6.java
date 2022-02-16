package serhatcode.switchh;

import java.util.Scanner;

public class Lesson6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Not Giriniz:");
		int grade = scanner.nextInt();
		int newGrade= grade/10;
		switch(newGrade) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Not 1");
			break;
		case 5:
			System.out.println("Not 2");
			break;
		case 6:
			System.out.println("Not 3");
			break;
		case 7:
			System.out.println("Not 4");
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("Not 5");
			break;
		default:
			System.out.println("Hatali not");
		}

	}

}
