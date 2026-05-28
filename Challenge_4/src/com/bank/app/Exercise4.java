package com.bank.app;
//Payment type detector
public class Exercise4 {

    public static String describePayment(Object p) {
        return switch (p) {
            case null -> "No payment";
            case Integer amt when amt <= 0 -> "Invalid/Reversal: " + amt;
            case Integer amt when amt < 100 -> "Micro card: " + amt + " EUR";
            case Integer amt when amt > 10000 -> "Large card: " + amt + " EUR";
            case Integer amt -> "Card: " + amt + " EUR";
            case Double d -> "Partial: " + d + " EUR";
            case String s when s.startsWith("VOUCHER") -> "Voucher: " + s;
            case String s -> "Other code: " + s;
            default -> "N/A";
        };
    }

    static void main() {
            System.out.println(describePayment(1500));
            System.out.println(describePayment(0));
            System.out.println(describePayment(-200));
            System.out.println(describePayment(50));
            System.out.println(describePayment(25000));
            System.out.println(describePayment(49.99));
            System.out.println(describePayment("VOUCHER-42"));
            System.out.println(describePayment("ABC-99"));
            System.out.println(describePayment(null));
        }
}
