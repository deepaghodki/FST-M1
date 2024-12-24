package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>(); // Parent is Set and HashSet is the type of Set
		// Adding element to HashSet
		hs.add("M");
		hs.add("B");
		hs.add("C");
		hs.add("A");
		hs.add("M");
		hs.add("X");

		// Print HashSet
		System.out.println("Original HashSet: " + hs);
		// Print size of HashSet
		System.out.println("Size of HashSet: " + hs.size());

		// Remove element
		System.out.println("Removing A from HashSet: " + hs.remove("A"));
		// Remove element that is not present
		if (hs.remove("Z")) {
			System.out.println("Z removed from the Set");
		} else {
			System.out.println("Z is not present in the Set");
		}

		// Search for element
		System.out.println("Checking if M is present: " + hs.contains("M"));
		// Print updated HashSet
		System.out.println("Updated HashSet: " + hs);
	}
}
