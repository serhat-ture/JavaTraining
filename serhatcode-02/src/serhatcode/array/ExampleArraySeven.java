package serhatcode.array;

import java.util.Arrays;

public class ExampleArraySeven {

	public static void main(String[] args) {
		char[]nameArray = new char[]{'b','d','a','m','d'};
		Arrays.sort(nameArray);
		System.out.println("find index:"+
				Arrays.binarySearch(nameArray, 'd'));
		String[]nameArrayString = new String[]{"burak"
				,"duman","ali","mehmet","duman2"};
		Arrays.sort(nameArrayString);
		System.out.println("find index:"+
				Arrays.binarySearch(nameArrayString, "burak"));
		
		System.out.println(Arrays.toString(nameArrayString));
	}

}
