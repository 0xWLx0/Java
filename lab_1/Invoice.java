package lab_1;

public class Invoice {

    private String number;
    private String description;
    private int quantity;
    private double item; 

    public Invoice() {

        this(null, null, 0, 0.0);

    }

    public Invoice(String number, String description, int quantity, double item) {

        this.number = number == null? "0": number;
        this.description = description == null ? "0": description;
        this.quantity = quantity > 0 ? quantity: 0;
        this.item = item > 0 ? item : 0.0;

    }

    public double getInvoicAmount() {


        return quantity * item;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {

        this.number = number == null? "0": number;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
 
        this.description = description == null ? "0": description;       

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity > 0? quantity: 0;
    }

    public double getItem() {
        return item;
    }

    public void setItem(double item) {
        this.item = item > 0 ? item: 0.0;
    } 
    
}
