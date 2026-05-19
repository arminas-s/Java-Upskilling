package com.bank.app;
//Pay Slip Calculator
public class Exercise1 {
    static void main() {
        System.out.println();
        printPaySlip("Liis", 3500, 0.22);
        System.out.println();
        printPaySlip("Mart", 5200, 0.22);
    }

    public static double calculateNetSalary(double gross, double rate) {
        return gross - (gross * rate);
    }

    public static double calculateEmployerSocialTax(double gross) {
        return gross * 0.33;
    }

    public static double calculateIncomeTax(double gross, double rate) {
        return gross * rate;
    }

    public static double calculateEmployerCost(double gross, double employerSocialTax) {
        return gross + employerSocialTax;
    }

    public static void printPaySlip(String name, double gross, double rate) {
        double netSalary = calculateNetSalary(gross, rate);
        double employerSocialTax = calculateEmployerSocialTax(gross);
        double incomeTax = calculateIncomeTax(gross, rate);
        double employerCost = calculateEmployerCost(gross, employerSocialTax);

        System.out.printf("%-15s:  %s%n", "PAY SLIP for", name);
        System.out.println("=============================");
        System.out.printf("%-15s: %8.2f EUR%n", "Gross Salary", gross);
        System.out.printf("%-15s: %8.2f EUR%n", "Income Tax", incomeTax);
        System.out.printf("%-15s: %8.2f EUR%n", "Employer Cost", employerCost);
        System.out.printf("%-15s: %8.2f EUR%n", "Net Salary", netSalary);
        System.out.println("=============================");
    }
}