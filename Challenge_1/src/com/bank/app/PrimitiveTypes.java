package com.bank.app;
//Exercise 4
public class PrimitiveTypes {
    static void main() {
        var myByte = 10;
        var myShort = 1000;
        int myInt = 50000;
        long myLong = 100000L;
        float myFloat = 5.75f;
        double myDouble = 19.99;
        var myBoolean = true;
        char myChar = 'A';

        System.out.println("byte value: " + myByte);
        System.out.println("short value: " + myShort);
        System.out.println("int value: " + myInt);
        System.out.println("long value: " + myLong);
        System.out.println("float value: " + myFloat);
        System.out.println("double value: " + myDouble);
        System.out.println("boolean value: " + myBoolean);
        System.out.println("char value:"+" " +myChar);

        System.out.println(Integer.MIN_VALUE);  // -2147483648
        System.out.println(Integer.MAX_VALUE);  //  2147483647
        System.out.println(Long.MAX_VALUE);  // 9223372036854775807
        System.out.println(Double.MAX_VALUE);  // 1.7976931348623157E308

        byte b = 127; b++;
        System.out.println(b);
        /* According to AI explanation:
        127 in binary (8-bit): 01111111
        With b++, it adds 1: 00000001 = 10000000
        This is interpreted as a negative number and corresponds to -128
        */

        int million = 1_000_000;
        long txLimit = 10_000_000L;
        System.out.println("underscored million: " + million);
        System.out.println("underscored txLimit: " + txLimit);


        char c = 'A';
        int code = c;
        char next = (char)(c + 1);
        System.out.println("c = " + c);
        System.out.println("code = " + code);
        System.out.println("next = " + next);

    }
}
