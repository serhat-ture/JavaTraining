package serhatcode.classObject;

public class Student {
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

@Override
public String toString() {
	return "Student [name=" + name + ", surname=" + surname + ", midTermGrade1=" + midTermGrade1 + ", midTermGrade2="
			+ midTermGrade2 + ", finalGrade=" + finalGrade + ", abc=" + abc + "]";
}

}
