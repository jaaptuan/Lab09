package Lab09;

import java.util.Random;
import java.util.Scanner;

public class IndexOut {
    public static void main(String[] args) {

        Random ran = new Random(99) ;
        Scanner input = new Scanner(System.in) ;


        int[] box = new int[100] ;
        boolean nextinput = true ;

        do { 
            try {
                System.out.println("Please enter index of array (0-99) : ") ;
                int index = input.nextInt() ;

                for(int i = 0 ; i < 99 ; i++) {
                    box[i] = ran.nextInt() ;
                }

                System.out.println("The value at index " + index + " is : " + box[index]);
                System.out.println("End nicely.");

                nextinput = false ;
                
            } catch (Exception e) {
                System.out.println("Out of Bounds");
                input.nextLine() ;

            }

        } while (nextinput);

        
    }
    
}
