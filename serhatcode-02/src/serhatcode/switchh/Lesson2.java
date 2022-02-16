package serhatcode.switchh;

import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Animal Name:");
		String animalName = scanner.next();

		switch (animalName) {
		case "DOG":
		case "CAT":
			System.out.println("Result : domestic");
			break;
		case "TIGER":
		case "ELEPHANT":
		case "WOLF":
			System.out.println("Result : Wild");
			break;
		default:
			System.out.println("Wrong Animal Name");
		}
		System.out.println("Finish");
	}

}
