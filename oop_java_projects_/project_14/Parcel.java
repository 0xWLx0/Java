package project_14;

public class Parcel<T> extends Shipment {

    // instance variables
    private double width;
    private double length;
    private double height;

    public Parcel(String receiver, double weight, T number, double width, double length, double height) {

        super(receiver, weight, number);

        this.width = width;
        this.length = length;
        this.height = height;

    }

    @Override
    public double shippingCost() {

        return ((width * length * height) * 2) + weight;

    }

    @Override
    public String toString() {

        return String.format("Parcel: %s, width: %.2f, length: %.2f, height: %.2f, Shipping cost: %.2f",
                super.toString(), width, length, height, shippingCost());

    }

}
