/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2a3randomarray;

/**
 *
 * @author Jack
 */
import java.util.Scanner;
public class U2A3RandomArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("We are going to add random numbers, the amount of which is your choosing");
        System.out.println("How many numbers would you like?..");
        Scanner keyedInput = new Scanner (System.in);
        final int amountofnumbers = keyedInput.nextInt();
        
        double total=0;
        
        
        
        double [ ] numbers = new double [amountofnumbers];
        
   	//collect values
                
    	for (int i = 0; i <= amountofnumbers-1; i = i + 1)
    	{
        	numbers[i] = (Math.random() * ((100 - 1) + 1)) + 1;
    	}
   	//output values 
        System.out.println("The numbers were...");
    	for (int i = 0; i <= amountofnumbers-1; i = i + 1)
    	{
            System.out.println(numbers[i]);
    	}
        for (int i = 0; i <= amountofnumbers-1; i = i + 1)
    	{
            total = total+numbers[i];
    	}
        System.out.println("And the total was...");
        System.out.println(total);
    }
    
}
