
package com.mycompany.lab.assignment;
import java.util.Scanner;

public class AgeFinder {

    public static void main(String[] args) {
        
//      This Java program prompts the user to enter their birth year and
//      then calculates and displays their age.

//      Variables which are required
        int birthYear, age, presentYear;


//      initializing scanner object
        Scanner input = new Scanner(System.in);
    
//      prompts user to input their birth year and assign it to a variable
        System.out.print("Enter your birth year: ");
        birthYear = input.nextInt();
        
//      prompts user to input present year and assign it to a variable
        System.out.print("Enter the present year: ");
        presentYear = input.nextInt(); 
        
//      caculating age
        age = presentYear - birthYear;
        
//      display output
        System.out.println("Your age is " + age);

//      closing scanner object to prevent unexpected behaviours
        input.close();
    }
}
