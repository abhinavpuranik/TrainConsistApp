/*
 * @author developer
 * version 2.0
 * Adding bogies
 */


package com.trainconsist.main;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		System.out.println("====================================================");
		System.out.println("---- UC2 - Add Passenger Bogies to Track----");
		System.out.println("=====================================================");
		
		List<String> passengerBogies = new ArrayList<>();
		passengerBogies.add("Sleeper");
		passengerBogies.add("AC Chair");
		passengerBogies.add("First Class");
		
		System.out.println("After Adding Bogies:");
		System.out.println("Passenger Bogies : " + passengerBogies);
		
		passengerBogies.remove("AC Chair");
		System.out.println("Passenger Bogies : " + passengerBogies);
		
		System.out.println("Checking if Sleeper exists");
		System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));
		
		passengerBogies.remove("Final Train Passenger Consist: ");
		System.out.println("Passenger Bogies : " + passengerBogies);
		
		System.out.println("UC2 operations completed successfully");
		
	}
}
