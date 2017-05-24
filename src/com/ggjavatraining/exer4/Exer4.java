package com.ggjavatraining.exer4;

import java.util.Scanner;

/**
 * Created by Jayson San Agustin on 24/05/2017.
 */
public class Exer4 {
    public static void main(String[] args) {

         GroceryItem egg = new GroceryItem("Egg", 5.0, 3);
         double eggTotal = egg.getTotal();
         System.out.println(egg.getItemQuantity() + " " + egg.getItemName() +"(s) : " + eggTotal );

         GroceryItem coconut = new GroceryItem("Coconut",15.0,1);
         double coconutTotal = coconut.getTotal();
         System.out.println(coconut.getItemQuantity() + " " + coconut.getItemName() +"(s) : " + coconutTotal );

         GroceryItem catFood = new GroceryItem("Cat Food", 150.0,2);
         double catFoodTotal = catFood.getTotal();
         System.out.println(catFood.getItemQuantity() + " "+ catFood.getItemName() + "(s) : " + catFoodTotal );

         GroceryItem ecoBag = new GroceryItem("Eco Bag",10.0,1);
         double ecoBagTotal = ecoBag.getTotal();
         System.out.println(ecoBag.getItemQuantity() + " "+ ecoBag.getItemName() + "(s) : " + ecoBagTotal );

         double bill = eggTotal + coconutTotal + catFoodTotal + ecoBagTotal;
         double payment = 200.0;
         if(bill > payment){
             double result = payment - bill;
             double result1 = result * -1;
             System.out.println("------------------------------");
             System.out.println("Total Amount : " + bill);
             System.out.println("Payment Amount: " + payment);
             System.out.println("Please add " + String.format("%.2f",result1) + " or higher to complete Transaction, Thank you!");
         }else{
             double result = payment - bill;
             System.out.println("------------------------------");
             System.out.println("Total Amount : " + bill);
             System.out.println("Payment Amount: " + payment);
             System.out.println("Your change is : " + result + " Thank you! come again!");
         }
    }
}
