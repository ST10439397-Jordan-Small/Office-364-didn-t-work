/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package office.pkg364.didn.t.work;

//Imports
import javax.swing.JOptionPane;


/**
 *
 * @author Jordan Small ST10439397
 */
public class Office364DidnTWork 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {   
        System.out.println("Hello, world!");  
     
    //Display message
        JOptionPane.showMessageDialog(null, "Hello, welcome to my application", "Textbox", JOptionPane.INFORMATION_MESSAGE);
    
    //Input message and seating upgrades
    {
        
        String result;
        //Question Message
        result = JOptionPane.showInputDialog(null, "What is your name!");
        //Result of the question
        JOptionPane.showMessageDialog(null, "Hello " + result + "! Welcome to AirBNB");
        
        //True or False questions' code
        int selection;
        boolean isYes; 
        
        //True or False question message
        selection = JOptionPane.showConfirmDialog(null, "Would you like to upgrade to 1st class");
        //True or False calculation
        isYes = (selection == JOptionPane.YES_OPTION);
        //Result of the question
        JOptionPane.showMessageDialog(null, "You responded " + isYes);
        
    }
    
    }
    
}
