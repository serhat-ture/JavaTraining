package serhatcode.classObject;

//Car modal, color, brand,maxSpeedLimit,speed
//car contructor  ile almanýzý,
// car toString, incSpeed (10 10 speed artiracak) 
//maxLimit i geçmeyecek þekilde
//Main car objesi oluþturun.
//main to string çaðýrýn
//main çaðýrýn incSpeed . 3 kere çaðýrýn
//main to string çaðýrýn
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
