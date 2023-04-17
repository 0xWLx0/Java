package lab_6_5;

public abstract class SalableBook extends Book {

    // instance variables
    private int price;
    private String category;

    // constructor
    public SalableBook(String title, Author author, String ISBN, int price, String category) {

        super(title, author, ISBN);

        this.price = price;
        this.category = category;

    }

    // getters and setters
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }                                       
    
    // abstract methods
    public abstract boolean isAvailable();
    public abstract double computeCost();

    @Override
    public String toString() {
        return super.toString() + "\nPrice: " + price + "\nCategory: " + category;
    }

}
