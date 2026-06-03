package com.bank.app;
import java.util.Scanner;
//Temperature week
public class Exercise2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 daily temperatures in Celsius:");
        int freezingDays = 0;
        int total = 0;
        int coldest = Integer.MAX_VALUE;
        int warmest = Integer.MIN_VALUE;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Day " + day + ": ");
            int temp = sc.nextInt();
            String feeling;

            if (temp < 0) {
                feeling = "freezing";
                freezingDays++;
            } else if (temp <= 10) {
                feeling = "cold";
            } else {
                feeling = "mild";
            }

            total += temp;

            if (temp < coldest) {
                coldest = temp;
            }
            if (temp > warmest) {
                warmest = temp;
            }

            System.out.printf("  %d   %s%n", temp, feeling);
        }
        double average = total / 7.0;

        System.out.println("----------------------------");
        System.out.println("Freezing days: " + freezingDays);
        System.out.printf("Coldest: %d   Warmest: %d   Average: %.1f%n", coldest, warmest, average);
    }
}