/*
 * @author Developer
 * @version 15.0
 *
 * UC20: Exception Handling During Search Operations
 */

package com.trainconsist.main;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println("UC20: Exception Handling During Search Operations");
        System.out.println("====================================================");

        List<String> bogieIds = new ArrayList<>();

        
        //bogieIds.add("BG101");

        String searchKey = "BG101";

        try {

            // Fail-fast validation
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException("Search cannot be performed: Train has no bogies.");
            }

            
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchKey)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie found: " + searchKey);
            } else {
                System.out.println("Bogie not found.");
            }

        } catch (IllegalStateException e) {

            System.out.println("ERROR: " + e.getMessage());

        }

        System.out.println("UC20 search validation completed.");
    }
}