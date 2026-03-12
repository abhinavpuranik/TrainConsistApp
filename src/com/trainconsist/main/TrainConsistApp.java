/*
 * @author Developer
 * @version 13.0
 *
 * UC18: Linear Search for Bogie ID
 */

package com.trainconsist.main;



public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println("UC18: Linear Search for Bogie ID");
        System.out.println("====================================================");

        // Array of Bogie IDs (unsorted)
        String[] bogieIds = {
                "BG101",
                "BG305",
                "BG210",
                "BG450",
                "BG125"
        };

        for (int i = 0; i < bogieIds.length; i++) {

            System.out.println(bogieIds[i]);
        }
        
        String searchKey = "BG450";

        boolean found = false;
        int position = -1;

        // Linear Search
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                position = i;
                break; 
            }
        }

        if (found) {
            System.out.println("Bogie found at position: " + position);
        } else {
            System.out.println("Bogie ID not found in the train consist.");
        }

        System.out.println("UC18 linear search completed.");

       
    }
}