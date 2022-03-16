package serhatcode.classObject;

import java.util.Arrays;
import java.util.Scanner;

public class PersonalMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Personal[] personalArray= new Personal[3];
		for(int i=0;i<personalArray.length;i++) {
			personalArray[i]= new Personal();
			System.out.println((i+1)+". Personel'in Adi:");
			personalArray[i].name= scanner.next();
			System.out.println((i+1)+". Personel'in Soyadi:");
			personalArray[i].surname= scanner.next();
			System.out.println((i+1)+". Personel'in Yasi:");
			personalArray[i].age = scanner.nextInt();
			System.out.println((i+1)+". Personel'in Maasi:");
			personalArray[i].salary= scanner.nextDouble();
		}
		System.out.println(Arrays.toString(personalArray));
	}

}
