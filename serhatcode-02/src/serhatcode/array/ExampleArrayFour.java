package serhatcode.array;

public class ExampleArrayFour {
	
	public static void main(String[] args) {
		int [] numberArray = {10,6,8,10};
		int [] numberArray2 = {10,6,8,11,12};
		System.out.println("Uzunluk1 : " + getArrayLenght(numberArray));
		System.out.println("Uzunluk2 : " + getArrayLenght(numberArray2));
	}
	
	private static int getArrayLenght(int [] array) {
		return array.length;
	}

}
