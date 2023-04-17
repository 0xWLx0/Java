package project_15;

public final class Ibook extends Book implements IProduct {

    // instance vairables
    private String website; 

    public Ibook(double price, String website) {

        super(price);
        
        this.website = website;

    }

    public double computeAmount() {

        return super.getPrice() * percentage;

    }

    @Override
    public double getPrice() {

        return super.getPrice() - computeAmount();

    }

    @Override
    public String toString() {

        return "Ibook[Website: " + website + ", " + super.toString() + ", new Price: " + getPrice() + "]";

    }
    
}
