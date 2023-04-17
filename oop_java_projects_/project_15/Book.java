package project_15;

public abstract class Book implements Product {

    // instance variables
    private double price;

    public Book(double price) {

        this.price = price;

    }

    @Override
    public double getPrice(){

        return price;

    }

    @Override
    public String toString() {

        return "Original Price: " + price;

    }
    
}
