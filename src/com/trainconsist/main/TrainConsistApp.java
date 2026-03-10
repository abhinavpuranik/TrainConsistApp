/*
 * @author Developer
 * @version 6.0
 * 
 * Maintaining bogie capacity using hashmap
 */

package com.trainconsist.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.trainconsist.model.*;

import java.util.List;

public class TrainConsistApp {
	
	public static void main(String[] args) {
		System.out.println("====================================================");
		System.out.println("---- Uc7 :- Sort bogies by capacity  ----");
		System.out.println("=====================================================");
		
		List<Bogie> bogies = new ArrayList<>();

        // Adding bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        
        System.out.println("Before sorting: ");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
    
        System.out.println("After sorting: ");
        
        for (Bogie b : bogies) {
            System.out.println(b);
        }
        
        
	}
	
}