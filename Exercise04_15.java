/*
 * Name: Exercise04_15
 * Purpose: Mimics an old telephone keypad and prints out the corresponding number to the letter by getting user input.
 * Programmer: Alex Kurcan
 * Date: 9/3/2025
 */

import java.util.Scanner;

public class Exercise04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a letter: ");
        String a = input.nextLine();

        // Convert to uppercase and take the first character
        char ch = Character.toUpperCase(a.charAt(0));

        // Check for valid input
        if (ch < 'A' || ch > 'Z') {
            System.out.println(ch + " is an invalid input. You must put a letter in.");
            return;
        }

        int digit = 0; //basically number 1, dec var
        if (ch >= 'A' && ch <= 'C') {
            digit = 2;
        } else if (ch >= 'D' && ch <= 'F') {
            digit = 3;
        } else if (ch >= 'G' && ch <= 'I') {
            digit = 4;
        } else if (ch >= 'J' && ch <= 'L') {
            digit = 5;
        } else if (ch >= 'M' && ch <= 'O') {
            digit = 6;
        } else if (ch >= 'P' && ch <= 'S') {
            digit = 7;
        } else if (ch >= 'T' && ch <= 'V') {
            digit = 8;
        } else if (ch >= 'W' && ch <= 'Z') {
            digit = 9;
        }

        // Output result
        System.out.println("The number is " + digit);
    }
}
