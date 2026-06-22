package com.bank.app;
import java.util.Locale;
//Monthly balance ledger
public class Exercise1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        double[] balances = {1200.00, -150.50, 800.25, -42.00, 2500.00, -1000.00};

        double total = 0.0;
        int credits = 0;
        int debits = 0;

        for (double value : balances) {
            total += value;

            if (value >= 0) {
                credits++;
            } else {
                debits++;
            }
        }

        double average = total / balances.length;
        double highest = balances[0];
        double lowest = balances[0];

        for (double value : balances) {
            if (value > highest) {
                highest = value;
            }
            if (value < lowest) {
                lowest = value;
            }
        }

        double netAfterFees = total - 6.00;

        System.out.printf("Total:   %.2f EUR%n", total);
        System.out.printf("Average: %.2f EUR%n", average);
        System.out.printf("Highest: %.2f EUR%n", highest);
        System.out.printf("Lowest:  %.2f EUR%n", lowest);
        System.out.printf("Credits: %d  Debits: %d%n", credits, debits);
        System.out.printf("Net after fees: %.2f EUR%n", netAfterFees);
    }
}
