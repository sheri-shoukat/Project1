

// Importing HashMap class
import java.util.HashMap;

public class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		
		HashMap<String, Integer> map = new HashMap<>();

		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		// Print size and content of the Map
		System.out.println("Size of map is:- "
						+ map.size());

		// Printing elements in object of Map
		System.out.println(map);


		if (map.containsKey("vishal")) {

			// Mapping
			Integer a = map.get("vishal");

			// Printing value fr the corresponding key
			System.out.println("value for key"
							+ " \"vishal\" is:- " + a);
		}
	}
}
