package serhatcode.switchh;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		final int pi=3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen yapmak istediginiz "
				+ "secenege g�re parantez icindeki degeri yaz�n�z:\n"
				+ "Daire Alan Hesaplama icin 1\n"
				+ "Kare Alan Hesaplama icin 2\n"
				+ "Dikdortgen Alan Hesaplama icin 3\n");
		int secim=scanner.nextInt();
		double alan=0;
		if(secim==1) {
		   	System.out.println("Yaricap giriniz:");
		   	int yaricap = scanner.nextInt();
		   	alan = yaricap * yaricap *pi ;
		}else if(secim==2) {
			System.out.println("Kenar giriniz:");
			int kenar = scanner.nextInt();
			alan = kenar * kenar;
		}else if(secim==3) {
			System.out.println("K�sa Kenar giriniz:");
			int kisaKenar = scanner.nextInt();
			System.out.println("Uzun Kenar giriniz:");
			int uzunKenar = scanner.nextInt();
			alan = kisaKenar * uzunKenar;
		}else {
			System.out.println("Hatali deger girdiniz");
		}
		
		if(alan!=0) {
			System.out.println("Alan:"+alan);
		}
	}

}
