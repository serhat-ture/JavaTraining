package serhatcode.array;
import java.util.Arrays;

public class ExampleArrayFive {

	public static void main(String[] args) {
		int [] numberArray = {8,6,3,15,1};
		int [] numberArray2 = {10,6,18,11,12};
		int [] numberArray3 = {};
		System.out.println("1.Array Toplami:"+sum(numberArray));
		System.out.println("2.Array Toplami:"+sum(numberArray2));
		System.out.println("1.Array Max:"+findMax(numberArray));
		System.out.println("2.Array Max:"+findMax(numberArray2));
		System.out.println("1.Array min:"+findMin(numberArray));
		System.out.println("2.Array min:"+findMin(numberArray2));
		print(sort(numberArray));
	}
	
	public static int sum(int [] array) {
		int toplam = 0;
		for(int i=0;i<array.length;i++) {
			toplam = toplam + array[i];
		}
		return toplam;
	}
	
	public static int findMax(int [] array) 
			throws ArrayIndexOutOfBoundsException{
		int maxNumber= array[0];
		for(int i=0;i<array.length;i++) {
			if(maxNumber<array[i]) {
				maxNumber=array[i];
			}
		}
		return maxNumber;
	}
	
	public static int findMin(int [] array) 
			throws ArrayIndexOutOfBoundsException{
		int minNumber=array[0];
		for(int i=0;i<array.length;i++) {
			if(minNumber>array[i]) {
				minNumber= array[i];
			}
		}
		return minNumber;
	}
	//
	public static int [] sort(int [] array) {
		for(int i=0; i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int handle = array[j+1];
					array[j+1]= array[j];
					array[j]=handle;
				}
			}
		}
		return array;
	}
	
	public static void print(int [] array) {
		System.out.print("Sayilar: ");
		for(int arrayElement:array) {
			System.out.print(arrayElement+" ");
		}
	}
}
