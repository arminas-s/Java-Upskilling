package com.bank.app;
//Exercise 2
public class Receipt {
    static void main(String[] args) {
        String item1 = "Coffee";   double price1 = 2.50;
        String item2 = "Sandwich"; double price2 = 5.90;
        String item3 = "Water";    double price3 = 1.20;
        double total = price1 + price2 + price3;
        System.out.println();
        System.out.println();
        System.out.printf("%-14s %6s", "Item", "Price");
        System.out.println();
        System.out.printf("%-14s %6.2f%n", item1, price1);
        System.out.printf("%-14s %6.2f%n", item2, price2);
        System.out.printf("%-14s %6.2f%n", item3, price3);
        System.out.println("----------------------");
        System.out.println("Total: " + total);
        System.out.println("VAT (20%)");
        double totalInclVat = total * 1.20;
        System.out.println("Total incl. VAT: " + totalInclVat);
    }
}
