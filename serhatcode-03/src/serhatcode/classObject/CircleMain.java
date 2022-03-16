package serhatcode.classObject;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("Enter Radius:");
		circle.radius = scanner.nextInt();
		
		System.out.println("Area : "+ circle.findArea());
		
		System.out.println("toString : "+ circle.toString());
		
		System.out.println("Enter Radius:");
		int radius = scanner.nextInt();
		Circle circleTwo = new Circle(radius,3);
		System.out.println("Area : "+ circleTwo.findArea());
		
		System.out.println("toString : "+ circleTwo.toString());	

	}

}
