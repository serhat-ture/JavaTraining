package serhatcode.array;

import java.util.Arrays;

public class ExampleArraySix {

	public static void main(String[] args) {
		int [][] arrayNumber= new int[][]{{2,3},{8,6},{6,2},{15,5}};
		System.out.println(Arrays.toString(arrayNumber[0]));
		System.out.println(Arrays.toString(arrayNumber[1]));
		System.out.println(Arrays.toString(arrayNumber[2]));
		System.out.println(Arrays.toString(arrayNumber[3]));
		System.out.println("Sum: "+sum(arrayNumber[0]));
		System.out.println("Diff: "+diff(arrayNumber[1][0],arrayNumber[1][1]));
		System.out.println("Mult: "+multiplication(arrayNumber[2]));
		System.out.println("Div: "+divide(arrayNumber[3]));
		
	}
	
	public static int sum(int[] array) {
		int sum =0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static int diff(int number,int number2) {
		int diff =number-number2;
		return diff;
	}
	
	public static int multiplication(int[] array) {
		int mult= array[0]* array[1];
		return mult;
	}
	
	public static int divide(int[] array) {
		int div= array[0]/ array[1];
		return div;
	}

}
