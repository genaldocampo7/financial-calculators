package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome!");
            scanner.nextLine();
            System.out.println("Please choose one of the following calculators:");
            System.out.println("1. Mortgage Calculator");
            System.out.println("2. Future Value Calculator");
            System.out.println("3. Present Value Calculator");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                     MortgageCalculator.mortgageCalculator(scanner);
                    break;
                case 2:
                    FutureValueCalculator.futureValueCalculator(scanner);
                    break;
                case 3:
                    PresentValueCalculator.presentValueCalculator(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
