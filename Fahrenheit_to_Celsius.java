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

public class Fahrenheit_to_Celsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Capture input from the keyboard
        
        Scanner input = new Scanner(System.in);
        
        System.out.print( "Enter temperature in Fahrenheit: " );
        
        double fahrenheit = input.nextDouble();
        
        //Conversion of Fahrenheit to Celsius
        
        double celsius = (fahrenheit - 32) * (5.0 / 9);
        
        // Output / Result to be displayed on the Screen
        
        System.out.println( fahrenheit + " Degrees Fahrenheit is " + celsius + " Degrees Celsius"  );
        
    }    
}
