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

import com.trainconsist.exception.CargoSafetyException;
import com.trainconsist.exception.InvalidCapacityException;
import com.trainconsist.model.*;

import java.util.List;

public class TrainConsistApp {
	
	public static void main(String[] args) throws InvalidCapacityException {
		
		System.out.println("====================================================");
        System.out.println("UC15: Safe Cargo Assignment Using try-catch-finally");
        System.out.println("====================================================");

        GoodsBogie bogie = new GoodsBogie("Rectangular");
		try {

			 System.out.println("Attempting cargo assignment...");
	         bogie.assignCargo("Petroleum");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        }
		finally {
            System.out.println("Cargo assignment operation completed .");

		}
        System.out.println("UC 16 runtime handling successful.");

        
        
	}
	
}