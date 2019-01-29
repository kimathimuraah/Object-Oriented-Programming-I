/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic_operations;

/**
 *
 * @author Muraah
 */

import java.util.Scanner;

public class Computation {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Capture input from the keyboard
        
        Scanner input = new Scanner(System.in);
        
        System.out.print( "Input First Number: " );
        
        int num1 = input.nextInt();
        
        System.out.print( "Input Second Number: " );
        
        int num2 = input.nextInt();
        
        // Calculation of listed Operators of Num1 and Num2
        
        int sum = num1 + num2;
        
        int difference = num1 - num2;
        
        int product = num1 * num2;
        
        int average = ((num1 + num2) / 2 );
        
        int distance = num1 - num2;
        
        // Output / Result to be displayed on the Screen
        
        System.out.println( " Sum Of Two Integers: " + sum );
        
        System.out.println( " Difference Of Two Integers: " + difference );
        
        System.out.println( " Product Of Two Integers: " + product );
        
        System.out.println( " Average Of Two Integers: " + average );
        
        System.out.println( " Distance Of Two Integers: " + distance );
        
        // Prints the largest of the two Integers
        
        System.out.println( " Max Integer: " + Math.max(num1, num2) );
        
        // Prints the smallest of the two Integers
        
        System.out.println( " Min Integer: " + Math.min(num1, num2) );
        
    }
}
