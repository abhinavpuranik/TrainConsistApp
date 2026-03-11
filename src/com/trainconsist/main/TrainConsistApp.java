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
		System.out.println("---- uc9: Group bogies by type  ----");
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

        
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                      .collect(Collectors.groupingBy(Bogie::getName));

        // Display grouped result
        groupedBogies.forEach((type, bogieList) -> {
            System.out.println("Bogie Type: " + type);
            bogieList.forEach(b -> System.out.println("   " + b));
        });
        
        		
        
        
	}
	
}