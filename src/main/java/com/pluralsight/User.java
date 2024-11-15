package com.pluralsight;

import java.util.Scanner;

public class User {
    private static Scanner scanner = new Scanner(System.in);

    // Method to handle integer input
    public static int getIntInput() {
        return scanner.nextInt();
    }

    // Method to handle string input
    public static String getStringInput() {
        scanner.nextLine();  // Consume newline
        return scanner.nextLine();
    }

}
