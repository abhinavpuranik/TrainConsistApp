/*
 * @author Developer
 * @version 14.0
 *
 * UC19: Binary Search for Bogie ID
 */

package com.trainconsist.main;



public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println("UC19: Binary Search for Bogie ID");
        System.out.println("====================================================");

        // Sorted array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG125",
                "BG210",
                "BG305",
                "BG450"
        };

        
        String key = "BG305";

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;
        int position = -1;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                position = mid;
                break;
            } 
            else if (comparison < 0) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

       
        if (found) {
            System.out.println("Bogie found at position: " + position);
        } else {
            System.out.println("Bogie ID not found in the train consist.");
        }

        System.out.println("UC19 binary search completed.");

      
    }
}