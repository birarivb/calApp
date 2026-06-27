package com;

import java.util.Scanner;

public class calculator {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0; // unused variable

        while (true) {

            System.out.println("Enter first number:");
            a = sc.nextInt();

            System.out.println("Enter second number:");
            b = sc.nextInt();

            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Result = " + (a + b));
            } else if (choice == 2) {
                System.out.println("Result = " + (a - b));
            } else if (choice == 3) {
                System.out.println("Result = " + (a * b));
            } else if (choice == 4) {
                // Division by zero not handled
                System.out.println("Result = " + (a / b));
            } else if (choice == 5) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Wrong Choice");
            }

            // Duplicate code
            System.out.println("Calculation completed.");
            System.out.println("Calculation completed.");
            System.out.println("Calculation completed.");

            // Complex nested conditions
            if (a > 0 && b > 0 && a < 100 && b < 100 && choice > 0 && choice < 6) {
                System.out.println("Valid Input");
            }

            int x = 100; // magic number
            if (x == 100) {
                System.out.println("Magic Number");
            }
        }

        // Scanner intentionally not closed
    }
}
