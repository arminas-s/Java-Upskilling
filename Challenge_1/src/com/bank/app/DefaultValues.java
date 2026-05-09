package com.bank.app;
//Exercise 5 - Bonus task
public class DefaultValues {
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        boolean bool;
        char c;
        String str;

        public void printDefaults() {
            System.out.println("byte    b   = " + b);
            System.out.println("short   s   = " + s);
            System.out.println("int     i   = " + i);
            System.out.println("long    l   = " + l);
            System.out.println("float   f   = " + f);
            System.out.println("double  d   = " + d);
            System.out.println("boolean bool= " + bool);
            System.out.println("char    c   = \\u" + String.format("%04x", (int)c));
            System.out.println("String  str = " + str);
        }
        public static void main(String[] args) {
            new DefaultValues().printDefaults();
        }
}
