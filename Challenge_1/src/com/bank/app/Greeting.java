package com.bank.app;
//Exercise 1
public class Greeting {
    static void main() {
        System.out.println("Hello, Swedbank!");
        System.out.print("Arminas");
        System.out.println("Snarskis");
        System.out.println();
        System.out.printf("%-8s %s%n", "Name:", "Arminas Snarskis");
        String firstName = "Arminas";
        System.out.printf("Hello, " + firstName + "!");
        System.out.println();
        System.out.printf("JDK: " + System.getProperty("java.version"));
    }
}