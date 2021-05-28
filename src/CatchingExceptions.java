import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchingExceptions {
    public static void main(String[] args){
        // https://docs.oracle.com/javase/8/docs/api/java/util/InputMismatchException.html
        Scanner kb = new Scanner(System.in);
        String firstName = "undefined";
        int age = 0;
        try{
            System.out.println("What is your first name?: ");
            firstName = kb.next();
            System.out.println("What is your age?: ");
            age = kb.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Error: Java expects that you type the correct type.");
            System.out.println(e.toString());
            return; // The return statement will stop execution of the main method
        }
        System.out.print("End of program...");
    }
}
