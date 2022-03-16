package serhatcode.classObject;


public class ExampleClassObjectTwo {

	public static void main(String[] args) {
		Student student = new Student();
		student.name="Burak";
		student.surname= "Duman";
		student.midTermGrade1=60;
		student.midTermGrade2=74;
		student.finalGrade=90;
		
		System.out.println("Average : "+ student.calculateAverage());
		

	}

}
