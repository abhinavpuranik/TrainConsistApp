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

import com.trainconsist.exception.InvalidCapacityException;
import com.trainconsist.model.*;

import java.util.List;

public class TrainConsistApp {
	
	public static void main(String[] args) throws InvalidCapacityException {
		try {

            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 60);

            // Invalid bogie
            PassengerBogie b3 = new PassengerBogie("General", -10);

            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
	}
	
}