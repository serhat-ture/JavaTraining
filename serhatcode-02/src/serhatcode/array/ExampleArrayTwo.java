package serhatcode.array;
import java.util.Scanner;

public class ExampleArrayTwo {

	// 10 elemanl� bir int array
	//d�ng� ile t�m elemanlara de�er atay�n
	// ayr� bir d�ng� atad���n�z de�erleri g�sterin
	public static void main(String[] args) {
		int [] numberArray= new int[10];
		Scanner scanner = new Scanner(System.in);
//		numberArray[0]=2;
//		numberArray[1]=5;
//		numberArray[2]=4;
//		numberArray[3]=3;
//		numberArray[4]=1;
//		numberArray[5]=7;
//		numberArray[6]=8;
//		numberArray[7]=1;
//		numberArray[8]=9;
//		numberArray[9]=10;
		
		for(int i=0; i<10;i++) {
			System.out.println("Sayi Giriniz:");
			numberArray[i]=scanner.nextInt();
		}

		System.out.print("Sayilar : ");
		for(int i=0; i<10;i++) {
			System.out.print(numberArray[i]+" ");
		}
	}

}
