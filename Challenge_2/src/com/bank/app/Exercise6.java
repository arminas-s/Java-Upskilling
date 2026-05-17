package com.bank.app;
//Customer Profile Card
public class Exercise6 {
    static void main() {
        String name="Mari Kivi";
        int age=34;
        var type="SAVINGS";
        var limit=5000.0;
        boolean active=true;
        int points=1200;

        Integer ageBoxed = age;

        System.out.println("age: " + age);
        System.out.println("ageBoxed: " + ageBoxed);

        System.out.println("==       : " + (ageBoxed == age));
        System.out.println(".equals(): " + ageBoxed.equals(age));
        System.out.println();
        String format = """
                        Name  : %s
                        Age   : %d
                        Type  : %s
                        Limit : %,.2f EUR
                        Active: %b
                        Points: %d
                        """.formatted(name, age, type, limit, active, points);

        String name2= "Jaan Tamm";
        int age2=200;
        var type2="CURRENT";
        var limit2=15000.0;
        boolean active2=false;
        int points2=350;

        String format2 = """
                        Name  : %s
                        Age   : %d
                        Type  : %s
                        Limit : %,.2f EUR
                        Active: %b
                        Points: %d
                        """.formatted(name2, age2, type2, limit2, active2, points2);

        System.out.println(format);
        System.out.println(format2);
    }
}
