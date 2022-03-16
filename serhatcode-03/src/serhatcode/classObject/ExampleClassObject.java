package serhatcode.classObject;

public class ExampleClassObject {
	///Student adýnda class model
	// Student -> name,surname,midtermGrade1,midtermGrade2,finalGrade
	// Student -> öðrenci ort hesaplocak. vize 20  final 60
	//Lombok

	public static void main(String[] args) {
		UserManager userManager=new UserManager(); 
		userManager.username="Burak";
		userManager.userSurname="Duman";
		userManager.age=1991;
		
		UserManager userManagerTwo = new UserManager();
		userManagerTwo.username="Sila";
		userManagerTwo.userSurname="Bati";
		userManagerTwo.age=1996;
		
		System.out.println("Cikti(1) :"+userManager.writeUsername()+
				" - "+ userManager.writeUserSurname()
				+ " - "+ userManager.writeAge());
		
		System.out.println("Cikti(2) :"+userManagerTwo.writeUsername()+
				" - "+ userManagerTwo.writeUserSurname()
				+ " - "+ userManagerTwo.writeAge());

	}

}
