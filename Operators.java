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

public class Operators {
    
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
        
        // Calculation of listed Arithmetic Operators of Num1 and Num2
        
        int sum = num1 + num2;
        
        int minus = num1 - num2;
        
        int product = num1 * num2;
        
        int division = num1 / num2;
        
        int modulus = num1 % num2;
        
        // Output / Result to be displayed on the Screen
        
        System.out.println( num1 + " + " +  num2 + " = " + sum );
        
        System.out.println( num1 + " - " +  num2 + " = " + minus );
        
        System.out.println( num1 + " * " +  num2 + " = " + product );
        
        System.out.println( num1 + " / " +  num2 + " = " + division );
        
        System.out.println( num1 + " % " +  num2 + " = " + modulus );
        
    }
    
}
