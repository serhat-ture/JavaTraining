package casting;

public class ExampleFour {

	public static void main(String[] args) {
		double doubleVal=100;
		int intVal = 20;
		
		int doubleToInt=(int)doubleVal;
		byte intToByte = (byte)intVal;
		
		System.out.println("Double to int :"
				+ doubleToInt);
		
		System.out.println("int to byte :"+
				intToByte);
		
		// Others
		double doubleVal2=65.5;
		int doubleToInt2= (int)doubleVal2;
		System.out.println("double to int (float)"
				+doubleToInt2);
		//2147483647
		
		long longVal = 3147483648L;
		int longToInt2 = (int)longVal;
		
		System.out.println("long to int (long)"
				+longToInt2);
		
	}
}
