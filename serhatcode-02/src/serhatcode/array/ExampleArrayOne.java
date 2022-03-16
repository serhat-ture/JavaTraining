package serhatcode.array;

import java.util.Arrays;

public class ExampleArrayOne {

	public static void main(String[] args) {
		int[][] arrayNumber = new int[2][3];
		int[][][] arrayNumber3 = new int[2][3][5];
		int[][] arrayNumber2 = new int[][] { { 1, 2 }, { 2, 2 } };
		// int [][] arrayNumber3= new int[2,3];
		String [][]arrayString = new String[2][2];
		arrayString[0][0]="Burak";
		arrayString[0][1]="Taner";
		arrayString[1][0]="Duman";
		arrayString[1][1]="Demir";
		System.out.println("isim :" + Arrays.toString(arrayString[0]));
		System.out.println("soyisim:" +Arrays.toString(arrayString[1]));
	}

}
