package serhatcode.classObject;

public class StudentTwo {
 public String name;
 public String surname;
 public int midTermGrade1;
 public int midTermGrade2;
 public int finalGrade;
 public int abc;
 
 public float calculateAverage() {
	 return (float) ((midTermGrade1*0.2)+(midTermGrade2*0.2)+
			 (finalGrade*0.6));
 }
}
