package com.bank.app;
//Loan eligibility checker
public class Exercise5 {

    public static boolean isEligible(double monthlyIncome, int age, int creditScore) {
        return monthlyIncome >= 1500 &&
               age >= 21 &&
               creditScore >= 500;
    }

    public static String getLoanRate(int creditScore) {
        if (creditScore >= 750) return "3.5%";
        else if (creditScore >= 650) return "5.0%";
        else if (creditScore >= 550) return "7.0%";
        else if (creditScore >= 500) return "9.0%";
        else return "Rejected";
    }

    public static String getLoanDecision(double income, int age, int score) {
        if (!isEligible(income, age, score)) {
            return String.format("REJECTED (income=%.0f EUR, age=%d, score=%d)", income, age, score);
        }

        String rate = getLoanRate(score);

        if (rate.equals("Rejected")) {
            return String.format("REJECTED (income=%.0f EUR, age=%d, score=%d)", income, age, score);
        }

        return String.format("APPROVED at %s (income=%.0f EUR, age=%d, score=%d)", rate, income, age, score);
    }

    static void main() {
        System.out.println("=== Exercise 5: Loan Eligibility Checker ===");
        System.out.println(getLoanDecision(3200, 35, 780));
        System.out.println(getLoanDecision(1800, 28, 670));
        System.out.println(getLoanDecision(1600, 22, 540));
        System.out.println(getLoanDecision(1200, 30, 700));
        System.out.println(getLoanDecision(2000, 19, 700));
        System.out.println(getLoanDecision(2000, 25, 480));

        String name = null;
        boolean safe = name != null && name.length() > 0;
        System.out.println();
        System.out.println("Short-circuit safe check on null name: " + safe);
    }
}
