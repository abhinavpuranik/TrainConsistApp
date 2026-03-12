/*
 * @author Developer
 * @version 17.0
 * 
 * Sorting builtin sort
 */

package com.trainconsist.main;

import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println("  UC16: Manual sorting using builtin sort");
        System.out.println("====================================================");

        
        int[] capacities = {70, 80, 10, 20, 60, 30};
        int n = capacities.length;
        
        System.out.println("Before Sorting:");

        
        System.out.println(Arrays.toString(capacities));
        

        System.out.println();
        
        Arrays.sort(capacities);
        
        System.out.println("\nAfter Sorting:");

        System.out.println(Arrays.toString(capacities));
        System.out.println("\nUC17 builtin sort completed.");
        

        
        
	}
	
}