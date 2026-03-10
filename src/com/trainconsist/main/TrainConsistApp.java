/*
 * @author Developer
 * @version 4.0
 * 
 * Maintaining formation order using linked hashset
 */

package com.trainconsist.main;

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {
	
	public static void main(String[] args) {
		System.out.println("====================================================");
		System.out.println("---- Uc4 :- Maintain Ordered Bogie Consist ----");
		System.out.println("=====================================================");
		
		Set<String> formation = new LinkedHashSet<>();
		formation.add("Engine");
		formation.add("Sleeper");
		formation.add("Cargo");
		formation.add("Guard");
		
		
		formation.add("Sleeper");
		
		System.out.println("Final Formation : " + formation);
		
		System.out.println("Linked Hash set prevents insertion order and removes duplicates automatically ");
		
		System.out.println("UC5 formation setup complete");
		
	}

}
