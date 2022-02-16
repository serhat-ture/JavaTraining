package serhatcode.switchh;

import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter Animal Name:");
	    String animalName= scanner.next();
	    
	    switch(animalName) {
	   case "DOG":
	    	System.out.println("Result :" + animalName);
	    	break;
	    case "CAT":
	    	System.out.println("Result :" + animalName);
	    	break;
	    case "TIGER":
	    	System.out.println("Result :" + animalName);
	    	break;
	    case "ELEPHANT":
	    	System.out.println("Result :" + animalName);
	    	break;
	    case "WOLF":
	    	System.out.println("Result :" + animalName);
	    	break;
	    default:
	    	System.out.println("Wrong Animal Name");
	    	 /*	
	    case "DOG":
	    case "CAT":
	    case "TIGER":
	    case "ELEPHANT":
	    case "WOLF":
	    	System.out.println("Result :" + animalName);
	    	break;
	    default:
	    	System.out.println("Wrong Animal Name");
	    	*/
	    }   
	    

	}

}
