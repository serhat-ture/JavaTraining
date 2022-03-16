package serhatcode.classObject;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car("2020", "Red","Skoda", 240, 215);
		System.out.println("toString :"+ car.toString());
		car.incSpeed();
		System.out.println("toString :"+ car.toString());
		car.incSpeed();
		System.out.println("toString :"+ car.toString());
		car.incSpeed();
		System.out.println("toString :"+ car.toString());
	}

}
