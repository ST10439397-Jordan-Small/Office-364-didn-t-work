/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package office.pkg364.didn.t.work;

//Imports
import java.util.Scanner;


/**
 * @author Jordan
*/

public class ArithmeticDemo 
{
    public static void main(String[] args)
    {
       
        //Variables
        int firstNumber; 
        int secondNumber;
        int sum;
        int difference;
        int average;
        
        //Keyboard input(Object)
        Scanner input = new Scanner(System.in);
        
        //User console
        System.out.print("Insert a integer >> ");
        firstNumber = input.nextInt();
        System.out.print("Insert another integer >> ");
        secondNumber = input.nextInt();
        
        //Calculation statements for the 2 integers
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;
        
        //Displaying the outcome of the sum, difference and average
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println("The difference between " + firstNumber + " + " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " + " + secondNumber + " = " + average);
        System.out.println("Potatos fly");
    }
    
    
}
