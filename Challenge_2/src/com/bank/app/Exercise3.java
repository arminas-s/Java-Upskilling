package com.bank.app;
//Temperature Converter
public class Exercise3 {
    static void main() {
        int tempCelsius = 37;
        double F = tempCelsius * 9.0 / 5 + 32;
        System.out.println("Celsius: " + tempCelsius);
        System.out.println("Fahrenheit: " + F);

        int newF = (int) F;
        System.out.println("Integer Fahrenheit: " + newF);

        double K = tempCelsius + 273.15;
        System.out.println("Kelvin: " + K);

        System.out.printf("%-12s %7.2f%n", "Celsius     =", (double) tempCelsius);
        System.out.printf("%-12s %7.2f%n", "Fahrenheit  =", F);
        System.out.printf("%-12s %7.2f%n", "Kelvin      =", K);

        double c = -40;
        double f = convertToFahrenheit(c);

        System.out.printf("%-12s %7.2f%n", "Celsius:", c);
        System.out.printf("%-12s %7.2f%n", "Fahrenheit:", f);
    }
    public static double convertToFahrenheit(double c) {
        return c * 9.0 / 5 + 32;
    }
}
