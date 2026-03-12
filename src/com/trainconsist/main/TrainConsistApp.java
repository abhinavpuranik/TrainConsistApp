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
		System.out.println("---- uc13: Performance comparision loop vs stream  ----");
		System.out.println("=====================================================");
		
		List<GoodsBogie> goodsBogies = new ArrayList<>();
		
		goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
		goodsBogies.add(new GoodsBogie("Cylindrical", "Diesel"));
		goodsBogies.add(new GoodsBogie("Non-Cylindrical", "Diesel"));
//		for (GoodsBogie b : goodsBogies) {
//	           System.out.println(b.getCargo() + b.getType());
//	       }
		for (int i = 0; i < 100000; i++) {
	            goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
	            goodsBogies.add(new GoodsBogie("Non-Cylindrical", "Coal"));
	        }
		
		long startLoop = System.nanoTime();

        boolean loopResult = true;

        for (GoodsBogie b : goodsBogies) {
            if (b.getType().equals("Cylindrical") && !b.getCargo().equals("Petroleum")) {
                loopResult = false;
                break;
            }
        }

        long endLoop = System.nanoTime();

        long loopTime = endLoop - startLoop;
		
		  
        long startStream = System.nanoTime();

        boolean streamResult = goodsBogies.stream()
                .allMatch(b -> !b.getType().equals("Cylindrical") || b.getCargo().equals("Petroleum"));

        long endStream = System.nanoTime();

        long streamTime = endStream - startStream;
        System.out.println("Loop Safety Result: " + loopResult);
        System.out.println("Stream Safety Result: " + streamResult);

        System.out.println("\nExecution Time (Loop): " + loopTime + " ns");
        System.out.println("Execution Time (Stream): " + streamTime + " ns");

        System.out.println("\nUC13 performance benchmarking completed.");
		
		  
		  
		  
		  
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