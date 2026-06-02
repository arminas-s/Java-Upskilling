package com.bank.app;
import java.util.Scanner;
//Running totals
public class Exercise1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();
        int total = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++){
            System.out.print("Enter a number:");
            int number = sc.nextInt();

            total += number;

            if (number > largest){
                largest = number;
            }

            if (number < smallest){
                smallest = number;
            }

            System.out.println("#" + i + ": " + number + " running total: " + total);
        }
        double average = (double) total / n;

        System.out.println("----------------------------");
        System.out.printf("Sum: %d Average: %.1f\n", total, average);
        System.out.println("Min: " + smallest + " Max: " + largest);
    }
}
