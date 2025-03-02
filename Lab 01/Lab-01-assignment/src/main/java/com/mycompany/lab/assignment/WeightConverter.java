/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab.assignment;
import java.util.Scanner;


public class WeightConverter {
    public static void main(String[] args) {

//      This java program converts weight KG to pound
        
//      initializing variables
        double kg, pound;
        
//      creating scanner object
        Scanner input = new Scanner(System.in);
        
//      taking input of weight in kg and assign it to a variable
        System.out.print("Enter weight (KG): ");
        kg = input.nextDouble();

//      calculating weight        
        pound = kg * 2.2;
        
//      display output
        System.out.println(kg + "KG/s is equal to " + pound + "pound/s");
        
//      closing scanner object to prevent unexpected behaviours
        input.close();
    }
}
