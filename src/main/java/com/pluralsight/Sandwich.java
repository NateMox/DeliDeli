package com.pluralsight;

public class Sandwich {

    private double price;

    private String description;

    public Sandwich() {
        this.price = 3.00;  // Default base price
        this.description = "Basic Sandwich";
    }

    public void customization(String scanner) {
        System.out.println("Customizing the sandwich...");

    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return description + " - $" + price;
    }
}
