package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What size sandwich would you like?");
        System.out.print("Please enter 1 for regular or 2 for large: ");

        int sizeInput = scan.nextInt();

        System.out.print("How old are you if you don't mind me asking? ");

        int age = scan.nextInt();
        String size;
        double basePrice, finalPrice;

        if(sizeInput == 1) {
            size = "Regular";
            basePrice = 5.45;
            if (age <= 17) {
                finalPrice = basePrice * .9;
            } else if (age >= 65) {
                finalPrice = basePrice * .8;
            } else {
                finalPrice = basePrice;
            }
            System.out.printf("Your %s sandwich costs: $%.2f", size, finalPrice);
        } else if (sizeInput == 2) {
            size = "Large";
            basePrice = 8.95;
            if (age <= 17) {
                finalPrice = basePrice * .9;
            } else if (age >= 65) {
                finalPrice = basePrice * .8;
            } else {
                finalPrice = basePrice;
            }
            System.out.printf("Your %s sandwich costs: $%.2f", size, finalPrice);
        } else {
            System.out.println("Invalid input, please try again and enter a valid size");
        }
    }
}
