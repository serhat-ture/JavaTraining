package serhatcode.switchh;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen Ondalik Sayi Giriniz(1):");
		float sayi1= scanner.nextFloat();
		System.out.println("Lutfen Ondalik Sayi Giriniz(2):");
		float sayi2= scanner.nextFloat();
		
		if(sayi1==sayi2) {
			System.out.println("Sayilar Esit");
		}else {
			System.out.println("Sayilar Esit Degil");
		}
		
		
	}

}
