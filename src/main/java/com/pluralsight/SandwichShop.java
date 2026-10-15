package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean condition = true;
        int sizeInput = 0;
        System.out.println("What size sandwich would you like?");

        while (condition){
            System.out.print("Please enter 1 for regular or 2 for large: ");
            sizeInput = scan.nextInt();

            if (sizeInput == 1 || sizeInput == 2){
                condition = false;
            } else {
                System.out.println("Invalid size, please try again.");
            }
        }

        System.out.print("How old are you if you don't mind me asking: ");
        boolean condition2 = true;
        int age = 0;

        while (condition2){
            while (!scan.hasNextInt()) {
                String invalidInput = scan.next();
                System.out.println("'" + invalidInput + "' is not a valid integer.");
                System.out.print("Please enter an integer for your age: ");
            }
            age = scan.nextInt();
            condition2 = false;
        }

        String size;
        double basePrice, finalPrice;

        if(sizeInput == 1) {
            size = "Regular";
            basePrice = 5.45;
        } else {
            size = "Large";
            basePrice = 8.95;
        }
        if (age <= 17) {
            finalPrice = basePrice * .9;
        } else if (age >= 65) {
            finalPrice = basePrice * .8;
        } else {
            finalPrice = basePrice;
        }
        System.out.printf("Your %s sandwich costs: $%.2f", size, finalPrice);
        scan.close();
    }
}
