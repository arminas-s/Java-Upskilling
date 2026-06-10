package com.bank.app;
import java.util.Locale;
import java.util.Formatter;
//Withdrawal with try-with-resources
public class Exercise2 {
    static String iban = "EE382200221020145685";
    static double balance = 100.00;

    public static void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException(
                    String.format("short by %.2f EUR", amount - balance)
            );
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        try (Formatter audit = new Formatter(System.out)) {
            audit.format("[audit open] %s%n", iban);
            try {
                withdraw(40.00);
                audit.format("Withdraw %.2f EUR -> OK, balance %.2f EUR%n", 40.00,balance);

            } catch (IllegalArgumentException e) {
                audit.format("Withdraw %.2f EUR -> DECLINED: %s%n", 40.00, e.getMessage());
            }
            audit.format("[audit close]%n");
            audit.format("[audit open] %s%n", iban);

            try {
                withdraw(100.00);
                audit.format("Withdraw %.2f EUR -> OK, balance %.2f EUR%n", 100.00, balance);

            } catch (IllegalArgumentException e) {
                audit.format("Withdraw %.2f EUR -> DECLINED: %s%n", 100.00, e.getMessage()
                );
            }
            audit.format("[audit close]%n");
        }
    }
}


