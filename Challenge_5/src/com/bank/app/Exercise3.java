package com.bank.app;
import java.util.Scanner;
//Transaction bar chart
public class Exercise3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int busiestDay = 0;
        int maxCount = 0;
        int[] count = new int[5];

        System.out.println("Enter transactions for 5 Days");

        for (int i = 0; i < 5; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            count[i] = sc.nextInt();

            total += count[i];

            if (count[i] > maxCount) {
                maxCount = count[i];
                busiestDay = i + 1;
            }
        }
        System.out.println();
        System.out.println("Weekly transactions (one # per transaction):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Day " + (i + 1) + ": ");

            for (int j = 0; j < count[i]; j++) {
                System.out.print("#");
            }
            System.out.println("  (" + count[i] + ")");
        }
        System.out.println("----------------------------");
        System.out.println("Busiest: Day " + busiestDay + " (" + maxCount + ")   Total: " + total);
    }
}
