package serhatcode.classObject;

import java.util.Calendar;

public class UserManager {
	//örnek için eklendi.
	private Calendar calendar= Calendar.getInstance();
	
	//attribute
	public String username,userSurname;
	public int age;
	//methods
	public String writeUsername() {
		return username;
	}
	
	public String writeUserSurname() {
		return userSurname;
	}
	
	public int writeAge() {
		return calendar.get(Calendar.YEAR)-age;
	}
}
