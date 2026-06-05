package com.bank.app;
import java.util.Scanner;
//Input validation
public class Exercise4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int invalidAttempts = 0;

        while (true) {
            System.out.print("Enter a positive number: ");

            if (!sc.hasNextInt()) {
                String badToken = sc.next();
                System.out.println(badToken + " is not a number - try again.");
                invalidAttempts++;
                continue;
            }
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Must be greater than zero - try again.");
                invalidAttempts++;
                continue;
            }
            System.out.println("Accepted: " + num + " (after " + invalidAttempts + " invalid attempts)");
            break;
        }
    }
}
