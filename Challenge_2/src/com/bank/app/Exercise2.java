package com.bank.app;

import java.math.BigInteger;
//Overflow Investigation
public class Exercise2 {
    static void main() {
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);

        int overflow = Integer.MAX_VALUE + 1;
        System.out.println("MAX_VALUE + 1: " + overflow);

        int underflow = Integer.MIN_VALUE - 1;
        System.out.println("MIN_VALUE - 1: " + underflow);

        long fix = (long) Integer.MAX_VALUE + 1;
        System.out.println("Fixed (long) MAX_VALUE + 1: " + fix);

        try {
            int trycatch = Math.addExact(Integer.MAX_VALUE, 1);
        }
            catch (ArithmeticException exception) {
            System.out.println("Overflow: " + exception.getMessage());
        }

        System.out.println("Long MAX_VALUE: " + Long.MAX_VALUE);

        BigInteger bigint = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("MAX_VALUE + 1 (BigInteger): " + bigint);

        double e = 1e-300;
        double undf = e / 1e100;
        System.out.println("Double underflow: " + undf);
    }
}
