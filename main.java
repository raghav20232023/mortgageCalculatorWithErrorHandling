package com.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculatorWithErrorHandling {
    public static void main(String[] args){
                //mortgage calculator
                //principal
                //annual interest rate
                // period in years
                //mortgage
        final byte MONTHS_IN_YEAR = 12; //12 Months in a year
        final byte PERCENT = 100;

        int principal = 0; //declaring variable outside scope
        float monthlyInterest = 0;
        int numberOfPayments = 0;


        Scanner scanner = new Scanner(System.in); //creates a scanner object for input

        while (true) {

            System.out.print("principal: "); //prints prompt for taking input for principal
            principal = scanner.nextInt(); //takes the input from the user and stores it in variable principal
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("enter a value between 1,000 and 1,000,000");

        }

        while (true) {
            System.out.print("annual interest rate: "); //prints prompt for taking input for annual interest rate
            float annualInterest = scanner.nextFloat(); //takes input from user for annual interest rate and stores it in the variable annualInterest
            if (annualInterest >=1 && annualInterest <=30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; // formula to calculate monthly interest based on annual interest
            }
            System.out.println("enter a value between 1 and 30"); //error prompt

            break;

        }

        while (true) {


            System.out.print("period (years): "); //prints prompt for taking input for number of years
            byte years = scanner.nextByte(); //takes input from user for period of years and stores in the variable years
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR; //assuming one payment per month, this calculates the number of payments for the entire duration of the mortgage
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
            double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
            // above line of code uses the formula to calculate mortgage given on the wikihow page


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage); // it is used to create a currency instance for a class numberFormat
        // in other words it takes the value in the variable mortgage and converts it to a currency value type data in which every three digits are separated by a comma
        System.out.println("Mortgage: " + mortgageFormatted); // it is used to print the final currency formatted value of mortgage








    }
}
