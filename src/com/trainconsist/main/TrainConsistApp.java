/*
 * @author Developer
 * @version 8.0
 * 
 * Filter using streams
 */

package com.trainconsist.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.trainconsist.model.*;

import java.util.List;

public class TrainConsistApp {
	
	public static void main(String[] args) {
		System.out.println("====================================================");
		System.out.println("---- uc10: Count total seats in train  ----");
		System.out.println("=====================================================");
		
		List<Bogie> bogies = new ArrayList<>();

        // Adding bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        
        System.out.println("Before grouping");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        
        int totalSeats = bogies.stream()
        				.map(b -> b.getCapacity())
        				.reduce(0, Integer::sum);

       
        
        System.out.println("Total seating capacity of train : " + totalSeats);
        
        		
        
        
	}
	
}