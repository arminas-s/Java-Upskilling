package com.bank.app;
//String & Comparison Basics
public class Exercise5 {
    static void main() {
        String currency = "EUR";
        String iban = "EE382200221020145685";

        System.out.printf("%-12s %7d%n", "Currency length = ", currency.length());
        System.out.printf("%-12s %7d%n", "IBAN length     = ", iban.length());

        System.out.println("Balance: " + 100 + 50);
        System.out.println("Balance: " + (100 + 50));

        String a = "EUR";
        String b = "EUR";
        System.out.println("a == b: " + (a == b));

        String c = new String("EUR");
        System.out.println("a.equals(c): " + a.equals(c));
        System.out.println("a == c: " + (a == c));

        System.out.println("ACC-" + 1001);
        System.out.println("ACC-" + 500 + 501);
        System.out.println("ACC-" + (500 + 501));

        double balance = 1_250.75;

        String string1 = String.valueOf(balance);
        System.out.println("String1: " + string1);

        String string2 = "" + balance;
        System.out.println("String2: " + string2);
    }
}
