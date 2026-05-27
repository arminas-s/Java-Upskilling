package com.bank.app;
import java.sql.SQLOutput;
//Transaction classifier
public class Exercise1 {

    public static String classifyAmount(double amount) {
        if (amount < 0) return "Reversal";
        else if (amount <= 99.99) return "Micro";
        else if (amount <= 999.99) return "Standard";
        else if (amount <= 9999.99) return "Large";
        else  return "Bulk";
    }

    public static double getFee(double amount) {
        String category = classifyAmount(amount);

        if (category.equals("Reversal")) return 0.50;
        else if (category.equals("Micro")) return 0.25;
        else if (category.equals("Standard")) return 1.50;
        else if (category.equals("Large")) return 5.00;
        else return 15.00;
    }

    public static String formatTransaction(double amount) {

        return String.format("Amount:%10.2f  Category: %-10s  Fee: %5.2f EUR",
                amount, classifyAmount(amount), getFee(amount));
    }

    static void main(String[] args) {

        double[] values = {-100, 0, 50, 500, 2500, 15000};

        System.out.println("=== Exercise 1: Transaction Classifier ===");

        for (double amount : values) {
            System.out.println(formatTransaction(amount));
        }

        System.out.println("Boundary Tests:");

        double[] boundaries = {99.99, 100, 999.99, 1000, 9999.99, 10000};

        for (double amount : boundaries) {
            System.out.println(formatTransaction(amount));
        }
    }
}

