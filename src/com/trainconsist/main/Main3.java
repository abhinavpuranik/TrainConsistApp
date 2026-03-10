/*
 * @author Developer
 * version 3.0
 * Uniqueness validation using HashSet
 */

package com.trainconsist.main;

import java.util.HashSet;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		
		System.out.println("====================================================");
		System.out.println("---- Track Unique Bogie IDs ----");
		System.out.println("=====================================================");
		
		Set<String> bogies = new HashSet<>();
		
		bogies.add("BG101");
		bogies.add("BG102");
		bogies.add("BG103");
		bogies.add("BG104");
		
		//Duplicate Entries
		bogies.add("BG101");
		bogies.add("BG102");
		
		System.out.println("Bogies after adding :" + bogies);
		
		System.out.println("Note: Duplicates are automatically ignored by Hashset\n");
		System.out.println("UC3 uniqueness validation complete");
		
		
		
	}
}
