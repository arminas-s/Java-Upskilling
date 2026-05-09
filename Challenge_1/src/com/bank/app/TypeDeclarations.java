package com.bank.app;
//Exercise 5
public class TypeDeclarations {
    static void main() {
        byte flags = 127;
        short year = 2026;
        int accountNumber = 100_234;
        long txId = 9_876_543_210L;
        float interestRate = 3.5f;
        double balance = 15_000.00;
        boolean isActive = true;
        char grade = 'A';

        System.out.println("byte flags = " + flags);
        System.out.println("short year = " + year);
        System.out.println("int accountNumber = " + accountNumber);
        System.out.println("long txId = " + txId);
        System.out.println("float interestRate = " + interestRate);
        System.out.println("double balance  = " + balance);
        System.out.println("boolean isActive  = " + isActive);
        System.out.println("char grade = " + grade);

//with var
        var vFlags = (byte) 127;
        var vYear = (short) 2026;
        var vAccountNumber = 100_234;
        var vTxId = 9_876_543_210L;
        var vInterestRate = 3.5f;
        var vBalance = 15_000.00;
        var vIsActive = true;
        var vGrade = 'A';

        System.out.println();
        System.out.println("var vFlags = " + vFlags);
        System.out.println("var vYear = " + vYear);
        System.out.println("var vAccountNumber = " + vAccountNumber);
        System.out.println("var vTxId = " + vTxId);
        System.out.println("var vInterestRate = " + vInterestRate);
        System.out.println("var vBalance = " + vBalance);
        System.out.println("var vIsActive = " + vIsActive);
        System.out.println("var vGrade = " + vGrade);

        System.out.println();
        String ownerName = "Mari Kivi";
        var ibanCode = "EE382200221020145685";
        System.out.println("ownerName = " + ownerName);
        System.out.println("ibanCode = " + ibanCode);

//all variables with aligned labels:
        System.out.println();
        System.out.println("byte    flags         = " + flags);
        System.out.println("short   year          = " + year);
        System.out.println("int     accountNumber = " + accountNumber);
        System.out.println("long    txId          = " + txId);
        System.out.println("float   interestRate  = " + interestRate);
        System.out.println("double  balance       = " + balance);
        System.out.println("boolean isActive      = " + isActive);
        System.out.println("char    grade         = " + grade);
        System.out.println("String  ownerName     = " + ownerName);
        }
}


