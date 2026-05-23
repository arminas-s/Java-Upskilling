package com.bank.app;
//Varargs Statistics Library
public class Exercise3 {
    static void main() {
        System.out.println("sum() = " + sum());
        System.out.println("sum(1, 2, 3, 4, 5) = " + sum(1,2,3,4,5));
        System.out.println("average(10, 20, 30) = " + average(10,20,30));
        System.out.println("max(3, 1, 4, 1, 5, 9, 2, 6) = " + max(3,1,4,1,5,9,2,6));
    }

    static double sum(double... values) {
        double t = 0;
        for (double v : values) {
            t += v;
        }
        return t;
    }

    static double average(double... values) {
        if (values.length == 0) {
            return 0;
        }
        return sum(values) / values.length;
    }

    static double max(double first, double... rest) {
        double m = first;
        for (double v : rest) {
            if (v > m) {
                m = v;
            }
        }
        return m;
    }
}
