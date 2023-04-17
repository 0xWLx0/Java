package project_15;

public final class PaperBook extends Book {

    private double weight;

    public PaperBook(double price, double weight) {

        super(price);
        this.weight = weight;

    }

    @Override
    public String toString() {

        return "PaperBook[Weight: " + weight + ", " + super.toString() + "]";

    }
    
}
