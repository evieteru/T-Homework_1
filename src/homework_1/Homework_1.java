/* Sources: 
	https://www.freeCodecamp.org/news/how-to-initialize-a-java-list
	https://www.freeCodecamp.org/news/java-iterator-hashmap-how-to-iterate-through-a-hashmap-with-a-loop
	*/
package homework_1;

import java.util.HashMap;

public class Homework_1 {

	public static void main(String[] args) {
		
		// Using array
		System.out.println("Using array iteration:");
		
		String[] names = {"Thomas Quan", "Alyssa Shaefer", "Evie Wilbur", "Wen-Hsin Chen"};
		String[] githubIDs = {"Tmqrdc", "AlyssaRShaefer", "evieteru", "23wc01"};
		
		for (int i =0; i < names.length; ++i) {
			System.out.println(names[i] + " - " + githubIDs[i]);
		}
		
		
		
		// Using HashMap
		System.out.println("\nUsing (unordered) HashMap iteration:");
		HashMap<String, String> namesAndIDs = new HashMap<>();
		namesAndIDs.put("Thomas Quan", "Tmqrdc");
		namesAndIDs.put("Alyssa Shaefer", "AlyssaRShaefer");
		namesAndIDs.put("Evie Wilbur", "evieteru");
		namesAndIDs.put("Wen-Hsin Chen", "23wc01");
		
		for (String name : namesAndIDs.keySet()) {
			String ID = namesAndIDs.get(name);
			System.out.println(name + " - " + ID);
		}
		
		
	}

}
