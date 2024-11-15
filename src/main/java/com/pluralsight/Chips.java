package com.pluralsight;

import java.util.Scanner;

public class Chips {
    private String type;

    // Fix: Change the method signature to accept a Scanner object, not a String.
    public void customize(Scanner scanner) {
        System.out.println("Select chips (Takis, Lays, Fritos, Cheetos): ");
        type = scanner.nextLine().trim();  // Get user input
    }

    public double getPrice() {
        return 1.50;  // Fixed price for chips
    }

    @Override
    public String toString() {
        return "Chips - Type: " + type + " - $" + String.format("%.2f", getPrice());
    }
}
