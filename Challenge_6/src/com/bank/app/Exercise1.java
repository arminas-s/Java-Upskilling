package com.bank.app;
import java.util.Locale;
//Safe parsing & division
public class Exercise1 {

    public static int parseAmount(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("invalid amount, using 0");
            return 0;
        }
    }

    public static int safeDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero, returning 0");
            return 0;
        }
    }

    static void main() {
        Locale.setDefault(Locale.ENGLISH);

        try {
            System.out.println(parseAmount("120"));
            System.out.println(parseAmount("12x"));
            System.out.println(safeDivide(100, 4));
            System.out.println(safeDivide(100, 0));
        } finally {
            System.out.println("validation complete");
        }
    }
}
