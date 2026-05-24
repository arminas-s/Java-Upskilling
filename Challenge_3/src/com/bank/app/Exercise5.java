package com.bank.app;
import java.util.Locale;
import java.util.Scanner;
//Interactive Calculator
public class Exercise5 {
    static void main() {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter number 2: ");
        double d2 = sc.nextDouble();
        sc.nextLine();

        System.out.println();

        System.out.printf("Sum:        %7.2f%n", d1 + d2);
        System.out.printf("Difference: %7.2f%n", d1 - d2);
        System.out.printf("Product:    %7.2f%n", d1 * d2);
        System.out.printf("Quotient:   %7.2f%n", d1 / d2);
        System.out.printf("Power:      %7.2f%n", Math.pow(d1, d2));
        System.out.printf("Hypotenuse: %7.2f%n", Math.sqrt(d1 * d1 + d2 * d2));
        System.out.printf("Round(d1):  %d%n"   , Math.round(d1));
        System.out.printf("Ceil(d1):   %7.2f%n", Math.ceil(d1));
        System.out.printf("Floor(d1):  %7.2f%n", Math.floor(d1));
    }
}
