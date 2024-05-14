//Java code to illustrate the values() method 
import java.util.*;

public class hashMapEx1 {
	public static void main(String[] args) {
		//Creating an empty HashMap
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		//Mapping string values to int keys
		hash_map.put(0, "Welcome");
		hash_map.put(1, "to");
		hash_map.put(2, "Collections");
		hash_map.put(3, "Frameworks");
		hash_map.put(4, "Example");

		//Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		//Using values() to get the set view of values
		System.out.println("The collection is: " + hash_map.values());
	}
}