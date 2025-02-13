package Lab09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mismatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        boolean nextinput = true ;

        do {
            try {
                System.out.print("Enter your 2 Number (Integer) : ");
        int num1 = input.nextInt() ;
        int num2 = input.nextInt() ;

        int sum = num1 + num2 ;

        System.out.println("The Number Entered is : " + sum) ;

        nextinput = false ;
                
            } 
            catch (InputMismatchException e) {
                System.out.println("Try again." + "(Incorrect input : an integer is required)");
                input.nextLine() ;

            }
        }
        while (nextinput);
    }
    
}
