package com.bank.app;
//Salary Calculator
public class Exercise1 {
    static void main() {
        double grossSalary = 2500.00;
        double incomeTaxRate = 0.22;
        int workingDays = 22;

        var incomeTax = grossSalary * incomeTaxRate;
        var netSalary = grossSalary - incomeTax; //Net salary might be lower due to total deductions upcoming in bonus task.
        var dailyRate = netSalary / workingDays;

        System.out.printf("%-14s %10.2f EUR%n", "Gross salary:", grossSalary);
        System.out.printf("%-14s %10.2f EUR%n", "Income tax:", incomeTax);
        System.out.printf("%-14s %10.2f EUR%n", "Net salary:", netSalary);
        System.out.printf("%-14s %10.2f EUR%n", "Daily rate:", dailyRate);
    //bonus task
        var unemploymentIns = grossSalary * 0.016;
        var pensionFund = grossSalary * 0.02;
        var totalDeductions = incomeTax + unemploymentIns + pensionFund;

        System.out.println("=============================");
        System.out.printf("%-14s %7.2f EUR%n", "Total deductions:", totalDeductions);
    }
}