package serhatcode.classObject;

//Car modal, color, brand,maxSpeedLimit,speed
//car contructor  ile alman�z�,
// car toString, incSpeed (10 10 speed artiracak) 
//maxLimit i ge�meyecek �ekilde
//Main car objesi olu�turun.
//main to string �a��r�n
//main �a��r�n incSpeed . 3 kere �a��r�n
//main to string �a��r�n
public class Car {
	public String modal;
	public String color;
	public String brand;
	public int maxSpeedLimit;
	public int speed;
	
	
	
	public Car(String modal, String color,
			String brand, int maxSpeedLimit, int speed) {
		this.modal = modal;
		this.color = color;
		this.brand = brand;
		this.maxSpeedLimit = maxSpeedLimit;
		this.speed = speed;
	}

	public void incSpeed() {
		if(speed+10<maxSpeedLimit) {
			speed+=10;
		}
	}

	@Override
	public String toString() {
		return "Car [modal=" + modal + ", color=" + color 
				+ ", brand=" + brand + ", maxSpeedLimit=" 
				+ maxSpeedLimit
				+ ", speed=" + speed + "]";
	}

}
