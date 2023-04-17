package project_14;

public class Envelope<T> extends Shipment {

    // instance variables
    private String type;

    public Envelope(String receiver, double weight, T number, String type) {

        super(receiver, weight, number);

        this.type = type;

    }

    @Override
    public double shippingCost() {

        return 2 + (2 * weight);

    }

    @Override
    public String toString() {

        return String.format("Envelope: %s, type: %s, Shipping cost: %.2f", super.toString(), type, shippingCost());

    }

}
