package com.bank.app;
//Exercise 3
/*This class calculates the monthly payment for a loan*/
//Proposed class name: MortgageCalculator
class Mgr {
    static final int MAX_VALUE = 100000;
    static double calculateMonthlyPayment(double principal, int months, double rate) {
        double monthlyRate = rate / 12;
        return principal*monthlyRate*Math.pow(1+monthlyRate,months)/(Math.pow(1+monthlyRate,months)-1);
    }
    static void main() {
        double amount=50000; int months=120; double rate=0.045;
        System.out.printf("Monthly: %.2f EUR%n", calculateMonthlyPayment(amount,months,rate));
    }
}