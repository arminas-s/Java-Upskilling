package com.bank.app;
//Arithmetic & Operators
public class Exercise4 {
    static void main() {
        double principal = 15_000.0;
        double annualRate = 0.045;
        int termMonths = 48;

        double monthlyInterest = principal * (annualRate / 12);
        System.out.println("Monthly Interest = " + monthlyInterest);

        double monthlyPayment = principal / termMonths + monthlyInterest;
        double totalCost = monthlyPayment * termMonths;

        System.out.println("Monthly Payment  = " + monthlyPayment);
        System.out.println("Total Cost       = " + totalCost);

        System.out.println(2 + 3 * 4);
        System.out.println(2 + (3 * 4));
        System.out.println((2 + 3) * 4);

        double balance = 700.0;
        balance -= 500.0;
        System.out.println("New balance after -= 500.0 = " + balance);
        balance += 25.0;
        System.out.println("New balance after += 25.0 = " + balance);
    }
}
