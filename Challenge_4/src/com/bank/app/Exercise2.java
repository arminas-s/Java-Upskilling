package com.bank.app;
//Grade calculator
public class Exercise2 {

    public static String letterGrade(int score) {
        return (score >= 90) ? "A" :
               (score >= 80) ? "B" :
               (score >= 70) ? "C" :
               (score >= 60) ? "D" :
                               "F" ;
    }

    public static boolean isPassing(int score) {
        return score >= 60;
    }

    public static String gradeMessage(int score) {
        String grade = letterGrade(score);
        String status = isPassing(score) ? "PASS" : "FAIL";

        return String.format("Score: %d — Grade: %s — Status: %s", score, grade, status);
    }

    static void main() {

        int[] scores = {95, 82, 71, 63, 45};

        System.out.println("=== Exercise 2: Grade Calculator ===");

        for (int s : scores) {
            System.out.println(gradeMessage(s));
        }
    }
}
