package serhatcode.forLoop;

public class ExampleTwo {

	public static void main(String[] args) {
		//1-100 aras�nda 3 er er artarken 4 ile b�l�nen say�lar�n toplam�
		int sum=0;
		for(int i=1;i<=100;i=i+3) {
			if(i%4==0) {
				sum+=i;
			}
		}
		
		System.out.println("Sum :"+sum);
		

	}
}
