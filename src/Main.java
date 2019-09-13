/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Rectangle Calculator
 * @Faruk Dalbay
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Area and Perimeter Calculator");
        
    // use Scanner object for user input
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
                System.out.println();
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width:  ");
        double width = sc.nextDouble();
        System.out.println("Area:         " + CalculateArea(length,width));
        System.out.println("Perimeter:    " + CalculatePerimeter(length,width));
        System.out.println("");
        System.out.print("Continue? (y/n)/: "); 
        choice = sc.next();
        }   
    } 
    // calculate the area
    public static double CalculateArea(double length, double width){
        return length * width;
    }
    // calculate the perimeter
    public static double CalculatePerimeter(double length, double width){
        return 2 * width + 2 * length;
    }
}
    
    
