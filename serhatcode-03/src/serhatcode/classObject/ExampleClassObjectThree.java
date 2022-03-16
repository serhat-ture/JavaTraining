package serhatcode.classObject;

import java.util.Arrays;

public class ExampleClassObjectThree {
	
	public static void main(String[] args) {
		Student [] studentArray = new Student[5];
	
		for(int i=0;i<studentArray.length;i++) {
			studentArray[i] = new Student();
			studentArray[i].name="Burak";
			studentArray[i].surname= "Duman";
			studentArray[i].midTermGrade1=60+i;
			studentArray[i].midTermGrade2=74+i;
			studentArray[i].finalGrade=90+i;
		}
		
		for(int i=0;i<studentArray.length;i++) {
		   System.out.println((i+1)+".Average : "+
		studentArray[i].calculateAverage());
		}
		System.out.println(Arrays.toString(studentArray));
	}

}
