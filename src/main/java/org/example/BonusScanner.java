package org.example;

import java.util.Scanner;

public class BonusScanner {
    public static void main(String[] args) {

        //Bonus: Implement a program that reads a text from the console and then outputs the letters individually. Tip: Learn about the Scanner class.

        Scanner scanner = new Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("Enter username");
        userName = scanner.nextLine();

        // Convert the string to an array of characters
        char[] charArray = userName.toCharArray();

        // Print the array elements
        for (char c : charArray) {
            System.out.println(c);
        }

    }
}
