package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void mortgageCalculator (Scanner scanner) {
        System.out.println("Welcome to Mortgage Calculator");
        scanner.nextLine();

        System.out.println("Enter loan amount"); System.out.print("$ ");
        double principal = scanner.nextDouble();

        System.out.println("Enter interest rate"); System.out.print("% ");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter loan length (years)");
        int loanLength = scanner.nextInt();

        double monthlyInterestRate = (interestRate / 100) / 12;
        int numberOfPayments = loanLength * 12;
        double monthlyPayment = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, - numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;
        double totalInterest = totalPayment - principal;

        System.out.printf("Expected monthly payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total interest paid: $%.2f%n", totalInterest);

        scanner.close();
    }
}









