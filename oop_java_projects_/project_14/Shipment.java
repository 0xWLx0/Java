package project_14;

public abstract class Shipment<T> implements Deliverable {

    // instance variables
    protected String receiver;
    protected double weight;
    protected T number;

    public Shipment(String receiver, double weight, T number) {

        this.receiver = receiver;
        this.weight = weight;
        this.number = number;

    }

    @Override
    public String getReceiver() {

        return receiver;

    }

    @Override
    public String toString() {

        return "Shipment receiver: " + receiver + ", weight: " + weight + ", number: " + number;

    }

}
