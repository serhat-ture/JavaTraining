package serhatcode.classObject;

//Circle class radius (int), pi=3 int  
//Circle findArea method . radius*radius*pi
//Main circle radius u kullanýcýdan alýn.
//find Area çýktýsý yazdýr.
//circle toString 
//main classýnda toString i yazdýrýn.
public class Circle {
	public int radius;
	public int pi=3;
	
	public Circle() {
	}
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	public Circle(int radius,int pi) {
		this.radius=radius;
		this.pi=pi;
	}
	public int findArea() {
		return radius * radius * pi;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + 
				", pi=" + pi + ", area=" + findArea() + "]";
	}

}
