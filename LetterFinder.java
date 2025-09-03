/*
 * Name: Phone Keypad
 * Purpose: Mimics an old telephone keypad and prints out the 
 *          corresponding number to the letter by getting user input.
 * Programmer: Alex Kurcan
 * Date: 9/3/2025
 */

import java.util.Scanner;
public class LetterFinder{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Get user input
            System.out.print("Enter a letter: ");
            String a = input.nextLine();
            
            // Making sure that the user puts a letter and not a number
            char ch = Character.toUpperCase(a.charAt(0));
            if (ch < 'A' || ch > 'Z') {
                System.out.println(ch + " is an invalid input. You must put a letter in.");
                return;
            }

            // Find the digit by checking which group of letters (ABC, DEF, etc.) and have a corresponding digit
            int digit = 0; // number 1 on the keypad (has no letters)
            if ("ABC".indexOf(ch) >= 0) {
                digit = 2;
            } else if ("DEF".indexOf(ch) >= 0) {
                digit = 3;
            } else if ("GHI".indexOf(ch) >= 0) {
                digit = 4;
            } else if ("JKL".indexOf(ch) >= 0) {
                digit = 5;
            } else if ("MNO".indexOf(ch) >= 0) {
                digit = 6;
            } else if ("PQRS".indexOf(ch) >= 0) {
                digit = 7;
            } else if ("TUV".indexOf(ch) >= 0) {
                digit = 8;
            } else if ("WXYZ".indexOf(ch) >= 0) {
                digit = 9;
}
        // Output with the digit
        System.out.println("The number is " + digit);
    }
}