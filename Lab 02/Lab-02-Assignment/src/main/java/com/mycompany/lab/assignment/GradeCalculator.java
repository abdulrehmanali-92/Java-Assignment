
package com.mycompany.lab.assignment;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        
//      This java program inputs your name and prints its length on the display screen.

//      required variables
        String name;
        int length;
        
//      initializing scanner object
        Scanner input = new Scanner(System.in);
        
//      prompts user to input their name and assign it to a variable
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
//      calculating length of name
        length = name.length();
        
//      display output
        System.out.println("The length of your name is: " + length);
        
//      closing scanner object to prevent unexpected behaviour
        input.close();
    }
}
