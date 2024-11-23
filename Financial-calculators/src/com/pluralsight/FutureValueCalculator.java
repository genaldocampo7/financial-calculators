package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalculator {
    public static void futureValueCalculator (Scanner scanner) {
        System.out.println("Welcome to Future Value Calculator");
        scanner.nextLine();

        System.out.println("Enter Deposit"); System.out.print("$ ");
        double deposit = scanner.nextDouble();

        System.out.println("Enter interest rate"); System.out.print("% ");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter number of years");
        int years = scanner.nextInt();

        double futureValue = deposit * Math.pow(1 + (interestRate / 100), years);
        double totalInterest = futureValue - deposit;

        System.out.printf("Future value: $%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: $%.2f%n", totalInterest);

        scanner.close();
    }
}









