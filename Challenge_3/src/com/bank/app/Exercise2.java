package com.bank.app;
//Method Overloading
public class Exercise2 {
    static void main() {

        describe(42);
        describe(3.14);
        describe("Swedbank");
        describe(10, 20);
        describe(true);
    }
    static void describe(int n) {
        System.out.println("Integer: " + n);
    }
    static void describe(double d) {
        System.out.printf("Double: %.2f%n", d);
    }
    static void describe(String s) {
        System.out.printf("String: \"%s\" (length=%d)%n", s, s.length());
    }
    public static void describe(int a, int b) {
        int sum = a + b;
        System.out.printf("Sum: (%d + %d)=%d%n", a, b, sum);
    }
    public static void describe(boolean b) {
        System.out.printf("Boolean: %b (inverted: %b)%n", b, !b);
    }

}
