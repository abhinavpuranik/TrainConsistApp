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
		System.out.println("---- uc11: Validate train id and cargo code  ----");
		System.out.println("=====================================================");
		
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
		
		Scanner scanner = new Scanner(System.in);
		
		Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
		Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");
		
		System.out.print("Enter Train ID: ");
	    String trainId = scanner.nextLine();

	    System.out.print("Enter Cargo Code: ");
	    String cargoCode = scanner.nextLine();
	    
	    Matcher trainMatcher = trainPattern.matcher(trainId);
	    Matcher cargoMatcher = cargoPattern.matcher(cargoCode);
	    
	    if (trainMatcher.matches()) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID format");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code format");
        }
        
        
        scanner.close();
        		
        
        
	}
	
}