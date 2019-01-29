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

public class Comparison {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Capture input from the keyboard
        
        Scanner input = new Scanner(System.in);
        
        System.out.print( " Input First Number: " );
        
        int num1 = input.nextInt();
        
        System.out.print( " Input Second Number: " );
        
        int num2 = input.nextInt();
        
              
        // Comparison
        
        boolean comparison = num1 == num2;
        
        // Output / Result to be displayed on the Screen
        
        System.out.println(" Is " + num1 + " equal to " + num2 + " ? " + comparison );
        
    }
}
