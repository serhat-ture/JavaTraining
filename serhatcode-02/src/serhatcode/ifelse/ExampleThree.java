package serhatcode.ifelse;

import java.util.Scanner;

public class ExampleThree {

	public static void main(String[] args) {
		Scanner scanner = 
				new Scanner(System.in);
		
	 System.out.println("Enter Grade:");
	 int grade = scanner.nextInt();
	 
	 if(grade>=0 && grade<50) {
		System.out.println("Grade 1/5"); 
	 }else if(grade>=50 && grade<60) {
		 System.out.println("Grade 2/5");
	 }else if(grade>=60 && grade<70) {
		 System.out.println("Grade 3/5");
	 }else if(grade>=70 && grade<85) {
		 System.out.println("Grade 4/5");
	 }else if(grade>=85 && grade<100){
		 System.out.println("Grade 4.85/5");
	 }else {
		 System.out.println("Wrong Grade!!");
	 }
	 
	}

}
