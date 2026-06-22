package com.bank.app;
import java.util.Locale;
//Branch transaction grid (jagged 2D)
public class Exercise3 {
    static int[][] grid = {{120, 45, 300}, {60, 90, 15, 200, 75}, {500}, {30, 30}};

    static String[] names = {
            "Tallinn",
            "Tartu",
            "Parnu",
            "Narva"
    };

    static int branchTotal(int row) {
        int total = 0;

        for (int c = 0; c < grid[row].length; c++) {
            total += grid[row][c];
        }
        return total;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        int grandTotal = 0;
        int busiestRow = 0;
        int busiestCount = grid[0].length;

        for (int r = 0; r < grid.length; r++) {
            int total = branchTotal(r);
            int txnCount = grid[r].length;

            System.out.printf("%-8s (%d txns): %d EUR%n", names[r], txnCount, total);

            grandTotal += total;

            if (txnCount > busiestCount) {
                busiestCount = txnCount;
                busiestRow = r;
            }
        }

        System.out.printf("Grand total: %d EUR%n", grandTotal);
        System.out.printf("Busiest branch: %s (%d txns)%n", names[busiestRow], busiestCount);
    }
}
