package serhatcode.switchh;

import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi1 Giriniz:");
		int sayi1=scanner.nextInt();
		
		System.out.println("Sayi2 Giriniz:");
		int sayi2=scanner.nextInt();
		
		int toplam= sayi1+sayi2;
		
		int result = toplam>30?1:(toplam==30?0:-1);
		//35 50 
		switch(result) {
		case 1:
			System.out.println("30'dan buyuk");
			break;
		case 0:
			System.out.println("30'a esit");
			break;
		case -1:
			System.out.println("30'dan kucuk");
			break;
		}

	}

}
