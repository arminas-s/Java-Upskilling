package com.bank.app;
import java.util.Scanner;
//Star pyramid
public class Exercise5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Height? ");
            n = sc.nextInt();

            if ((n >= 1) && (n <= 9)) {
                break;
            } else {
                System.out.println("Please enter a number between 1 and 9");
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int lsp = 0; lsp < n - i; lsp++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
