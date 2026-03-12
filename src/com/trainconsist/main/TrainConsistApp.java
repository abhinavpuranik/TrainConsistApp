/*
 * @author Developer
 * @version 16.0
 * 
 * Sorting bubble sort
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

import com.trainconsist.exception.CargoSafetyException;
import com.trainconsist.exception.InvalidCapacityException;
import com.trainconsist.model.*;

import java.util.List;

public class TrainConsistApp {
	
	public static void main(String[] args) throws InvalidCapacityException {
		
		System.out.println("====================================================");
        System.out.println("  UC16: Manual sorting using bubble sort");
        System.out.println("====================================================");

        
        int[] capacities = {70, 80, 10, 20, 60, 30};
        int n = capacities.length;

        System.out.println("Before Sorting:");

        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println();
        
        for(int i = 0; i < n-1; i++) {
        	for(int j = 0; j<n-i-1; j++) {
        		if(capacities[j] > capacities[j + 1]) {
        			int temp = capacities[j];
        			capacities[j] = capacities[j+1];
        			capacities[j+1] = temp;
        		}
        	}
        }
        
        System.out.println("\nAfter Sorting:");

        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\nUC16 bubble sort completed.");
        

        
        
	}
	
}