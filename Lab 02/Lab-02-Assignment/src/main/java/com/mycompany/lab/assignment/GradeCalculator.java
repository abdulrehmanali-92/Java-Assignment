
package com.mycompany.lab.assignment;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        
//      This java program inputs 5 subjects marks and print their grade

//      making scanner object
        Scanner input = new Scanner(System.in);
               
//      required variables
        String[] subjects = {"Math", "Computer", "Science", "English", "Islamiat"};
        
//      assigning default value to prevent error(might not been initialized)
        double total = 0, average = 0;
        char grade = ' ';
        
        for (String subject: subjects){
            System.out.print("Enter marks of " + subject + ": ");
            double marks = input.nextDouble();
            
            if (marks >= 0 && marks <= 100 ){
                total += marks;
            } else{
                System.out.println("Invalid number");
                return;
            }
            
        }
        
        average = total * subjects.length;
        
        if (average >= 88){
            grade = 'A';
        } else if(average >= 70){
            grade = 'B';
        } else if(average < 70){
            grade = 'C';
        }
        
        System.out.println("You got " + grade + " Grade");
    }
}
