package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private ArrayList<Sandwich> sandwiches = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<Chips> chips = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    // Add a sandwich to the order (take Scanner to handle user input)
    public void addSandwich(Scanner scanner) {
        Sandwich sandwich = new Sandwich();
        sandwich.customization(scanner);  // Use the Scanner to customize the sandwich
        sandwiches.add(sandwich);
    }

    // Add a drink to the order (take Scanner to handle user input)
    public void addDrink(Scanner scanner) {
        Drink drink = new Drink();
        drink.customize(scanner);  // Use the Scanner to customize the drink
        drinks.add(drink);
    }

    // Add chips to the order (take Scanner to handle user input)
    public void addChips(Scanner scanner) {
        Chips chip = new Chips();
        chip.customize(scanner);  // Use the Scanner to customize the chips
        chips.add(chip);
    }

    // Handle checkout process
    public void checkout(Scanner scanner) {
        System.out.println("\n-- Order Summary --");
        displayOrder();  // Display all items in the order
        System.out.println("Total: $" + calculateTotalPrice());  // Calculate and display total price
        System.out.print("Confirm the order? (yay or nay): ");

        String confirm = scanner.nextLine().trim();  // Get user confirmation for the order
        if (confirm.equalsIgnoreCase("yay")) {
            System.out.println("Receipt saved!");
            // Add save receipt logic here if needed
        } else {
            System.out.println("Order cancelled.");
            cancelOrder();  // Clear the order
        }
    }

    // Display the current order details
    public void displayOrder() {
        System.out.println("\nYour Sandwiches:");
        for (Sandwich sandwich : sandwiches) {
            System.out.println(sandwich);
        }

        System.out.println("\nYour Drinks:");
        for (Drink drink : drinks) {
            System.out.println(drink);
        }

        System.out.println("\nYour Chips:");
        for (Chips chip : chips) {
            System.out.println(chip);
        }
    }

    // Calculate the total price of the order
    public double calculateTotalPrice() {
        double total = 0;
        for (Sandwich sandwich : sandwiches) {
            total += sandwich.getPrice();  // Ensure the getPrice method exists in Sandwich
        }
        for (Drink drink : drinks) {
            total += drink.getPrice();  // Ensure the getPrice method exists in Drink
        }
        for (Chips chip : chips) {
            total += chip.getPrice();  // Ensure the getPrice method exists in Chips
        }
        return total;
    }

    // Cancel the order (clear all items)
    public void cancelOrder() {
        sandwiches.clear();
        drinks.clear();
        chips.clear();
        System.out.println("Order cancelled and cleared.");
    }
}
