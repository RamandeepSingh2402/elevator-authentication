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

        System.out.println("What is the password? ");
        String password = kb.next();


        if(floorNumber >0 && floorNumber <21 && floorNumber != 13 && password.equals("password123")){
                System.out.println("Traveling");

        }
        else {
            System.out.println("Invalid floor");
        }


    }
}
