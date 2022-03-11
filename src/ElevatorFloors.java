/*
    Write a program that ask the user to which floor he wants to go (int).
    The building has floors from 1-20 and does not have the 13th floor

    Print an error message if the user selects and invalid floor
    Print: "Traveling" if it is a valid floor
 */

import java.util.Scanner;

public class ElevatorFloors {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter the floor number (1-20): ");

        int floorNumber = kb.nextInt();

        if(floorNumber<0){
            System.out.println("You entered a negative floor value");
            recall();
        }
        if(floorNumber==13){
            System.out.println("You entered 13 as the floor value, which is invalid.");
            recall();
        }
        if(floorNumber>20){
            System.out.println("You entered a floor value greater than 20, which is invalid.");
            recall();
        }

        System.out.println("What is the password? ");
        String password = kb.next();

        if(password.equalsIgnoreCase("password123")){
                System.out.println("Traveling");
                return;
        }

        else{
            System.out.println("Incorrect password");
            recall();
        }


    }

    private static void recall() {
        //scanner class for this method
        Scanner in = new Scanner(System.in);

        //asking for the floor number
        System.out.println("Please enter the floor number (1-20): ");
        int floorNumber = in.nextInt();

        if(floorNumber<0){
            System.out.println("You entered a negative floor value");
            recall();
        }
        if(floorNumber==13){
            System.out.println("You entered 13 as the floor value, which is invalid.");
            recall();
        }
        if(floorNumber>20){
            System.out.println("You entered a floor value greater than 20, which is invalid.");
            recall();
        }

    }
}
