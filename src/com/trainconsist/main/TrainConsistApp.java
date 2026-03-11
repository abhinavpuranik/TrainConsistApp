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
		System.out.println("---- uc8: Filter Passenger bogies using streams  ----");
		System.out.println("=====================================================");
		
		List<Bogie> bogies = new ArrayList<>();

        // Adding bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        
        System.out.println("Before filtering");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        
        //filtering over a particular capacity
        List<Bogie> highCapacityBogies = bogies.stream()
        		.filter(b -> b.getCapacity() > 60)
        		.collect(Collectors.toList());
        
        System.out.println("High Capacity bogies");
        highCapacityBogies.forEach(System.out::println);
        
        		
        
        
	}
	
}