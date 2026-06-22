package com.bank.app;
import java.util.Arrays;
import java.util.Locale;
//Account-number toolkit
public class Exercise2 {
    static int[] accounts = {4071, 1180, 9920, 3050, 6611, 2025};

    static int[] sortedCopy(int[] data) {
        int[] copy = Arrays.copyOf(data, data.length);
        Arrays.sort(copy);
        return copy;
    }

    static int indexOf(int[] sorted, int id) {
        return Arrays.binarySearch(sorted, id);
    }

    static int[] topN(int[] sorted, int n) {
        int start = sorted.length - n;
        return Arrays.copyOfRange(sorted, start, sorted.length);
    }

    static int[] freshLedger(int size) {
        int[] ledger = new int[size];
        Arrays.fill(ledger, -1);
        return ledger;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        System.out.println("Original: " + Arrays.toString(accounts));

        int[] sorted = sortedCopy(accounts);

        System.out.println("Sorted:   " + Arrays.toString(sorted));
        System.out.println("Original after sort: " + Arrays.toString(accounts));
        System.out.println("Find 9920: index " + indexOf(sorted, 9920));
        System.out.println("Find 5000: index " + indexOf(sorted, 5000));
        System.out.println("Top 3:    " + Arrays.toString(topN(sorted, 3)));
        System.out.println("Fresh ledger(4): " + Arrays.toString(freshLedger(4)));

        int[] again = sortedCopy(accounts);

        System.out.println("sorted == again:        " + (sorted == again));
        System.out.println("Arrays.equals:          " + Arrays.equals(sorted, again));

        /* Comparing array references - two different arrays are false even if they contain same values.
           Arrays.equals returns true when all elements match */
    }
}
