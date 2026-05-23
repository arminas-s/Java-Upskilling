package com.bank.app;
//Recursion
public class Exercise4 {
    static void main() {
    System.out.println("power(2,0) = " + power(2,0)); // res: 1
    System.out.println("power(2,1) = " + power(2,1)); // res: 2
    System.out.println("power(2,8) = " + power(2,8)); // res: 256
    System.out.println("power(3,4) = " + power(3,4)); // res: 81

    System.out.println();
    System.out.println("countdown(5):");
    countdown(5);

    System.out.println();
    System.out.println("sumDigits(1234) = " + sumDigits(1234));
    }

    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Go!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }
}