package lab_6_5;

public class PaperBook extends SalableBook {

    // instance variables
    private double weight;
    private int quantity;

    public PaperBook(String title, Author author, String ISBN, int price, String category, double weight, int quantity) {

        super(title, author, ISBN, price, category);
        this.weight = weight;
        this.quantity = quantity;

    }

    // setters and getters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean isAvailable() {

        if(quantity > 0)
            return true;
        
        return false;
        

    }

    @Override
    public double computeCost() {

        return super.getPrice() * weight;

    }

    @Override
    public String toString() {

        return super.toString() + "\nWeight: " + weight + "\nQuantity: " + quantity;

    }
     
}
