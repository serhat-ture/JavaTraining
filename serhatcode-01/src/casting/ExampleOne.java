package casting;

public class ExampleOne {

	public static void main(String[] args) {
		int intVal1=1;
		int intVal2=2;
		int intVal3=3;
		int intVal4=4;
		
		boolean booleanVal = (intVal1<intVal3);
		boolean booleanVal2= (intVal2>intVal4);
		
		System.out.println("< Result : "+ booleanVal);
		System.out.println("> Result : "+ booleanVal2);
		
		System.out.println("& Result: " + (booleanVal & booleanVal2));
		System.out.println("&& Result: " + (booleanVal && booleanVal2));
		
		
		System.out.println("| Result: " + (booleanVal | booleanVal2));
		System.out.println("|| Result: " + (booleanVal || booleanVal2));
		
		System.out.println("! Result: " + !(booleanVal));

	}

	// 14 1110
	// & 
	// 3  0011
 	// =  0010   
	// 2 
	
	// 14 1110
	// |
	// 3  0011
	// =
	// 15 1111
	
	// ~3 0011
	// -4 1100
	
	// 3 1100
	// <<
	// 2
	// 12  1100 
	
	// 5 0101
	//>>
	//2
	// 1     0001
	
}
