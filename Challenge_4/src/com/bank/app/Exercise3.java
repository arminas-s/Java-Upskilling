package com.bank.app;
//Month info
public class Exercise3 {

    public static int getDaysInMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            return 31;

            case 4:
            case 6:
            case 9:
            case 11:
            return 30;

            case 2:
            return 28;

            default:
            return -1;
        }
    }

    public static String getSeason(int month) {
        return switch (month) {
            case 12, 1, 2  -> "Winter";
            case 3, 4, 5   -> "Spring";
            case 6, 7, 8   -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "N/A";
        };
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "N/A";
        };
    }

    public static int getQuarter(int month) {
        return switch (month) {
            case 1, 2, 3   -> 1;
            case 4, 5, 6   -> 2;
            case 7, 8, 9   -> 3;
            case 10, 11, 12 -> 4;
            default -> -1;
        };
    }

    public static void printMonth(int month) {
        System.out.printf(
                "Month %2d: %-9s - %2d days - %-7s - Q%d%n",
                month,
                getMonthName(month),
                getDaysInMonth(month),
                getSeason(month),
                getQuarter(month)
        );
    }

    static void main() {
        printMonth(1);
        printMonth(2);
        printMonth(3);
        printMonth(4);
        printMonth(5);
        printMonth(6);
        printMonth(7);
        printMonth(8);
        printMonth(9);
        printMonth(10);
        printMonth(11);
        printMonth(12);
    }
}
