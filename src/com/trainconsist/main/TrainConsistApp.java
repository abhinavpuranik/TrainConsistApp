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
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.Scanner;
import com.trainconsist.model.*;

import java.util.List;

public class TrainConsistApp {
	
	public static void main(String[] args) {
		System.out.println("====================================================");
		System.out.println("---- uc12: Safetu compliance check for goods bogies  ----");
		System.out.println("=====================================================");
		
		List<GoodsBogie> goodsBogies = new ArrayList<>();
		
		goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
		goodsBogies.add(new GoodsBogie("Cylindrical", "Diesel"));
		goodsBogies.add(new GoodsBogie("Non-Cylindrical", "Diesel"));
		for (GoodsBogie b : goodsBogies) {
           System.out.println(b.getCargo() + b.getType());
       }
		  
		  
		boolean passesCheck = goodsBogies.stream()
				  				.allMatch(n -> !n.getType().equals("Cylindrical") || n.getCargo().equals("Petroleum"));
		  
		  
		System.out.println("Safety Compliance Status: " + passesCheck);
		if(passesCheck) {
			System.out.println("Train formation is SAFE");
		}else {
			System.out.println("Train formation is not SAFE");
		}
		
		System.out.println("UC12 safety validation completed");
		  
		  
		  
		  
//		List<Bogie> bogies = new ArrayList<>();
//
//        // Adding bogies
//        bogies.add(new Bogie("Sleeper", 72));
//        bogies.add(new Bogie("AC Chair", 60));
//        bogies.add(new Bogie("First Class", 40));
//        
//        System.out.println("Before grouping");
//        for (Bogie b : bogies) {
//            System.out.println(b);
//        }
//
//        
//        int totalSeats = bogies.stream()
//        				.map(b -> b.getCapacity())
//        				.reduce(0, Integer::sum);
//
//       
//        
//        System.out.println("Total seating capacity of train : " + totalSeats);
//        
		
		
        
        
	}
	
}