package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//This example demonstrates how to create an ArrayList using the ArrayList() constructor 
//and add new elements to an ArrayList using the add() method.
public class CreateArrayListExample {
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>(); 
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println(fruits);


		//Traversing list through for-each loop
		for(String f:fruits)
			System.out.println(f);

		System.out.println("************************");

		//Sorting the list
		Collections.sort(fruits);
		for(String f:fruits)
			System.out.println(f);
	}
}
