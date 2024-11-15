package com.pluralsight;

public class MainApp {
    private static Order currentOrder = new Order();  // Assuming you have an Order class

    public static void main(String[] args) {
        int choice;
        String sandwichType = "Veggie";  // Default choice, can be customized
        String drinkType = "Coke";       // Default drink choice
        String chipsType = "Lays";       // Default chips choice

        do {
            System.out.println("\n-- Welcome to the Mox Deli --");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Enter your choice: ");

            choice = UserInput.getIntInput();  // This is a new helper method for input

            if (choice == 1) {
                showOrderScreen(sandwichType, drinkType, chipsType);
            } else if (choice == 0) {
                System.out.println("Exiting the application.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    // Show the order screen
    public static void showOrderScreen(String sandwichType, String drinkType, String chipsType) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter your choice: ");

            int choice = UserInput.getIntInput();  // Helper method for input

            switch (choice) {
                case 1:
                    addSandwich(sandwichType);  // Pass the type
                    break;
                case 2:
                    addDrink(drinkType);  // Pass the drink type
                    break;
                case 3:
                    addChips(chipsType);  // Pass the chips choice
                    break;
                case 4:
                    checkout();
                    isRunning = false; // End the order process
                    break;
                case 0:
                    cancelOrder();
                    isRunning = false; // End the order process
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Add sandwich to the order
    private static void addSandwich(String sandwichType) {
        System.out.println("Adding " + sandwichType + " to your order.");
        currentOrder.addSandwich(sandwichType);  // Adjust method to handle string type
    }

    // Add drink to the order
    private static void addDrink(String drinkType) {
        System.out.println("Adding " + drinkType + " to your order.");
        currentOrder.addDrink(drinkType);  // Adjust method to handle drink type
    }

    // Add chips to the order
    private static void addChips(String chipsType) {
        System.out.println("Adding " + chipsType + " to your order.");
        currentOrder.addChips(chipsType);  // Adjust method to handle chips choice
    }

    // Checkout the order
    private static void checkout() {
        System.out.println("Checking out your order...");
        currentOrder.checkout();  // No need to pass scanner anymore
    }

    // Cancel the order
    private static void cancelOrder() {
        System.out.println("Your order has been cancelled.");
        currentOrder.cancelOrder();  // Cancel and clear items
    }
}
