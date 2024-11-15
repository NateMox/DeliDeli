package com.pluralsight;

public class Drink {
    private double price;
    private String description;

    // Constructor with drink type
    public Drink(String drinkType) {
        switch (drinkType.toLowerCase()) {
            case "coke":
                this.price = 1.50;
                this.description = "Coke";
                break;
            case "fanta":
                this.price = 1.50;
                this.description = "Fanta";
                break;
            case "gatorade":
                this.price = 2.00;
                this.description = "Gatorade";
                break;
            case "apple juice":
                this.price = 1.75;
                this.description = "Apple Juice";
                break;
            default:
                this.price = 1.50;
                this.description = "Basic Drink";
                break;
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return description + " - $" + price;
    }
}
