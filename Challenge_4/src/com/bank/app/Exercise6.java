package com.bank.app;
//Nato phonetic alphabet
public class Exercise6 {

    public static String phonetic(char c) {
        return switch (Character.toUpperCase(c)) {
            case 'A' -> "Alpha";
            case 'B' -> "Bravo";
            case 'C' -> "Charlie";
            case 'D' -> "Delta";
            case 'E' -> "Echo";
            case 'F' -> "Foxtrot";
            case 'G' -> "Golf";
            case 'H' -> "Hotel";
            case 'I' -> "India";
            case 'J' -> "Juliett";
            case 'K' -> "Kilo";
            case 'L' -> "Lima";
            case 'M' -> "Mike";
            case 'N' -> "November";
            case 'O' -> "Oscar";
            case 'P' -> "Papa";
            case 'Q' -> "Quebec";
            case 'R' -> "Romeo";
            case 'S' -> "Sierra";
            case 'T' -> "Tango";
            case 'U' -> "Uniform";
            case 'V' -> "Victor";
            case 'W' -> "Whiskey";
            case 'X' -> "X-ray";
            case 'Y' -> "Yankee";
            case 'Z' -> "Zulu";
            default -> "?";
        };
    }

    public static String spellPair(char a, char b) {
        return phonetic(a) + " " + phonetic(b);
    }

    public static String spellCallsign(char a, char b, char c) {
        return phonetic(a) + " " + phonetic(b) + " " + phonetic(c);
    }

    public static String digit(int d) {
        return switch (d) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "?";
        };
    }

    static void main() {
        System.out.println("=== Exercise 6: NATO Phonetic Alphabet ===");
        System.out.println("A -> " + phonetic('A'));
        System.out.println("z -> " + phonetic('z'));
        System.out.println("5 -> " + phonetic('5'));
        System.out.println();
        System.out.println("EST -> " + spellCallsign('E', 'S', 'T'));
        System.out.println("FIN -> " + spellCallsign('F', 'I', 'N'));
        System.out.println("SOS -> " + spellCallsign('S', 'O', 'S'));
        System.out.println();
        System.out.println("EE -> " + spellPair('E', 'E'));
        System.out.println();
        String year = digit(2) + " " +
                      digit(0) + " " +
                      digit(2) + " " +
                      digit(6);
        System.out.println("Digits: " + year);
    }
}
