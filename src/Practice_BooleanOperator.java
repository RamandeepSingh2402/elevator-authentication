/**
 * Practice Boolean Operator Statements - CSCI 1105 Week 4
 * Writing correct syntax for Boolean operators in selection statements
 * @author Eric Poitras
 */

import java.util.Scanner;

public class Practice_BooleanOperator {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        /*
        * Print "What is your program?"
        * Initialize program, a String to input from console
        * If program is equal to "BCS" or "BACS"
        *   Print "You can enroll in Section 01" and skip a  line
        * Else
        *   Print "You can enroll in Section 02" and skip a line
        * */

        /*
        * Test Case
        * Input: "BCS"
        * Output: "You can enroll in Section 01"
        * */
        System.out.println("What is your program?");
        String program = kb.next();
        if(program.equals("BCS") || program.equals("BACS")){
            System.out.println("You can enroll in Section 01");
        }
        else{
            System.out.println("You can enroll in Section 02");
        }
    }
}
