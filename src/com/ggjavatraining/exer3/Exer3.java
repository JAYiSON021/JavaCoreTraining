package com.ggjavatraining.exer3;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Jayson San Agutsin on 24/05/2017.
 */
public class Exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit of your Array : ");
        int arrLimit = sc.nextInt();
        ArrayList<Integer> primeArray = new ArrayList();
        for (int num = 1; num <= arrLimit; num++){
            boolean isPrime = true;
            for (int sNum = 2; sNum < num; sNum++){
                if(num % sNum == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeArray.add(num);
            }
        }
        System.out.println("Prime numbers : " + primeArray);
    }
}
