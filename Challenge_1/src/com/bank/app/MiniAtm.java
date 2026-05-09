package com.bank.app;
//Exercise 6
public class MiniAtm {
    static void main() {
        String ownerName = "Liis Tamm";
        String accountId = "EE382200221020145685";
        double balance = 2_500.00;
        double withdrawal = 200.00;
        System.out.printf("=== ATM === | Account: %s | Owner: %s%n", accountId, ownerName);

        double newBalance = balance - withdrawal;
        System.out.printf("Withdrawal amount: %.2f | New Balance: %.2f%n", withdrawal, newBalance);

        double taxAmount = withdrawal * 0.002;
        double netReceived = withdrawal - taxAmount;
        System.out.printf("Fee: %.2f EUR | Net received: %.2f EUR%n", taxAmount, netReceived);

    //multi-line ATM receipt
        System.out.println();
        System.out.printf("""
                             =========== ATM ================
                             Account   : %s
                             Owner     : %s
                             ================================
                             Withdrawn : %16.2f EUR
                             Fee       : %16.2f EUR
                             Net       : %16.2f EUR
                             Balance   : %16.2f EUR
                             ================================
                          """, accountId, ownerName, withdrawal, taxAmount, netReceived, newBalance);
            }
        }
