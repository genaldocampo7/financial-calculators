package com.pluralsight;

import java.util.Scanner;

public class PresentValueCalculator {
    public static void presentValueCalculator (Scanner scanner) {

        System.out.println("Welcome to Present Value Calculator");
        scanner.nextLine();

        System.out.println("Enter monthly payout");
        System.out.print("$ ");
        double payOut = scanner.nextDouble();

        System.out.println("Enter interest rate");
        System.out.print("% ");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter years to payout");
        int yearsPayOut = scanner.nextInt();

        double presentValue = estimatedPresentValue(payOut, interestRate, yearsPayOut);

        System.out.printf(" The Present value is $%.2f %n" , presentValue);

        scanner.close();
    }

    public static double estimatedPresentValue(double payOut, double interestRate, int yearsPayOut) {
        double monthlyRate = interestRate / 100 / 12;
        int totalPayment = yearsPayOut * 12;

        return payOut * (1 - Math.pow(1 + monthlyRate, - totalPayment)) / monthlyRate;
    }
}
