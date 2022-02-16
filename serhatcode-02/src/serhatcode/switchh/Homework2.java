package serhatcode.switchh;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen yil giriniz:");
		int yil = scanner.nextInt();
		
		if((yil%100!=0 && yil%4==0)
				|| (yil%100==0 && yil%400==0)) {
			System.out.println("Artik Yil");
			
		}else {
			System.out.println("Artik Yil Degil");
		}

	}

}
