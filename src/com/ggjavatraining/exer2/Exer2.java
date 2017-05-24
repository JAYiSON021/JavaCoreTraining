package com.ggjavatraining.exer2;

import java.util.Scanner;

/**
 * Created by Jayson San Augustin on 24/05/2017.
 */
public class Exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select your shape to compute the Area:");
        System.out.println("1 : Square");
        System.out.println("2 : Rectangle");
        System.out.println("3 : Triangle");
        System.out.print("Enter the number of the corresponding shape: ");
        int shapeNumber;
        shapeNumber = sc.nextInt();

        switch (shapeNumber) {
            case 1:
                System.out.println("You Selected shape SQUARE");
                System.out.print("Please Enter the the Squares side length: ");
                double sqWidth = sc.nextDouble();
                double result = sqWidth * sqWidth;
                System.out.println("The Area of your square is: " + String.format("%.2f", result));
                break;
            case  2:
                System.out.println("You selected shape RECTANGLE");
                System.out.print("Please Enter the width: ");
                double rectWidth = sc.nextDouble();
                System.out.println("\n");
                System.out.print("Please Enter the Height: ");
                double rectHeight = sc.nextDouble();
                double rectResult = rectHeight * rectWidth;
                System.out.println("The Area of your Rectangle is: " + String.format("%.2f", rectResult));
                break;
            case 3:
                System.out.println("You selected shape TRIANGLE");
                System.out.print("Please Enter the Triangle's base: ");
                double triBase = sc.nextDouble();
                System.out.println("\n");
                System.out.print("Please Enter your triangle's Height: ");
                double triHeight = sc.nextDouble();
                double triResult = 1.5 * triBase * triHeight;
                System.out.println("The Area of your Triangle is: " + String.format("%.2f", triResult));
                break;
            default:
                System.out.println("Invalid Entry! Bye");
                break;
        }
    }
}
