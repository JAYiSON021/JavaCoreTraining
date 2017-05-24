package com.ggjavatraining.exer1;

import java.util.Scanner;

/**
 * Created by Jayson San Agustin on 24/05/2017.
 */
public class Exer1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            int out = num * i;
            System.out.println(out);
        }
    }
}
