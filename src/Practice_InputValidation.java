/**
 * Practice Input Validation Statements - CSCI 1105 Week 4
 * Writing correct syntax for Input Validation in selection statements
 * @author Eric Poitras
 */

import java.util.Scanner;

public class Practice_InputValidation {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        /*
         * Print "What is your parking zone? (A-C): "
         * Initialize zone, a String to input read from console
         * Initialize zoneChar, a char set to index 0 of zone
         * If input read from console is uppercase and equal to A, B, or C
         *   Print the concatenation of "Your parking zone is " and zone and skip a line
         *
         * */

        /*
         * Test Case
         * Input: "A"
         * Output: "Your parking zone is A"
         * */
        System.out.println("What is you parking zone? (A-C): ");
        String zone = kb.next();
        char zoneChar = zone.charAt(0);
        if(Character.isUpperCase(zoneChar) && zone.equals("A") || zone.equals("B") ||zone.equals("C")){
            System.out.println("Your parking zone is " + zone );
        }
    }
}