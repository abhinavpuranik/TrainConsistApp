/*
 * @author Developer
 * @version 6.0
 * 
 * Maintaining bogie capacity using hashmap
 */

package com.trainconsist.main;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class TrainConsistApp {
	
	public static void main(String[] args) {
		System.out.println("====================================================");
		System.out.println("---- Uc6 :- Map bogie to capacity ----");
		System.out.println("=====================================================");
		
		Map<String, Integer> capacityMap = new HashMap<>();
		
		capacityMap.put("First Class", 24);
		capacityMap.put("Cargo", 24);
		capacityMap.put("Sleeper", 72);
		capacityMap.put("AC Chair", 56);
		
		System.out.println("Bogie capacity details: ");
		
		for(Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			
		}
	
		System.out.println("UC6 bogie capacity mapping complete");
		
	}

}
