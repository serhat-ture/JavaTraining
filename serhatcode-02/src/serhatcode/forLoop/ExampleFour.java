package serhatcode.forLoop;

public class ExampleFour {

	// 6 ile 50 aras�nda 3 ile b�l�m�nden kalan 2 olan say�lar k�mesinden
	// �ift olanlar�n �arp�m�
	public static void main(String[] args) {
		long result = 1;
		/*
		 * for(int i =6;i<=50;i++) { if(i%3==2 && i%2==0) { //if(i%2==0) { result*=i; }
		 * } }
		 */

		for (int i = 6; i <= 50; i++)
			if (i % 3 == 2 && i % 2 == 0)
				result *= i;
		System.out.println("result " + result);
		

	}

}
