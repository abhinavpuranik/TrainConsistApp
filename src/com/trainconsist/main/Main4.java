/*
 * @author Developer
 * version 4.0
 * Using linked list to maintain order
 */

package com.trainconsist.main;

import java.util.LinkedList;

import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		System.out.println("====================================================");
		System.out.println("---- Uc4 :- Maintain Ordered Bogie Consist ----");
		System.out.println("=====================================================");
		
		List<String> trainConsist = new LinkedList<>();
		
		trainConsist.addLast("Engine");
		trainConsist.addLast("Sleeper");
		trainConsist.addLast("AC");
		trainConsist.addLast("Cargo");
		trainConsist.addLast("Guard");
		
		System.out.println("Initial train consist : " + trainConsist);
		
		trainConsist.add(2, "Pantry Car");
		
		System.out.println("After adding pantry car at position 2 : " + trainConsist);
		
		trainConsist.removeFirst();
		trainConsist.removeLast();
		
		System.out.println("After removing first and last bogie : " + trainConsist);
		
		
		System.out.println("UC4 ordered consist operations completed");
		
		
	}

}
