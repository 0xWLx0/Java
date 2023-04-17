package lab_1;

public class InvoiceTest {
    
    public static void main(String[] args) {
         
        Invoice invoice0 = new Invoice();

        // before update
        System.out.printf("Invoice 0: %s\t%s\t%d\t%.2f\n", invoice0.getNumber(), invoice0.getDescription(), invoice0.getQuantity(), invoice0.getItem());

        // invoice amount
        System.out.printf("Invoice 0 amount: %.2f%n", invoice0.getInvoicAmount());

        invoice0.setNumber("000023");
        invoice0.setDescription("white book");
        invoice0.setQuantity(70);
        invoice0.setItem(150.00);

        // after update
        System.out.printf("Invoice 0: %s\t%s\t%d\t%.2f\n", invoice0.getNumber(), invoice0.getDescription(), invoice0.getQuantity(), invoice0.getItem());

        // invoice amount
        System.out.printf("Invoice 0 amount: %.2f%n", invoice0.getInvoicAmount());


        Invoice invoice1 = new Invoice("004323", "Black Book", 500, 250.00);

        // invoice before
        System.out.printf("Invoice 1: %s\t%s\t%d\t%.2f\n", invoice1.getNumber(), invoice1.getDescription(), invoice1.getQuantity(), invoice1.getItem());

        // invoice amount before
        System.out.printf("Invoice 1 amount: %.2f%n", invoice1.getInvoicAmount());

        invoice1.setNumber("000693");
        invoice1.setDescription("yellow book");
        invoice1.setQuantity(700);
        invoice1.setItem(25.35);
 
        // invoice after 
        System.out.printf("Invoice 1: %s\t%s\t%d\t%.2f\n", invoice1.getNumber(), invoice1.getDescription(), invoice1.getQuantity(), invoice1.getItem());       invoice1.setItem(25.00);
        
        // invoice amount after
        System.out.printf("Invoice 1 amount: %.2f%n", invoice1.getInvoicAmount());


        Invoice invoice2 = new Invoice("004324", "Pink Book", 300, 50.00);
        
        // invoice before
        System.out.printf("Invoice 2: %s\t%s\t%d\t%.2f\n", invoice2.getNumber(), invoice2.getDescription(), invoice2.getQuantity(), invoice2.getItem());
 
        // invoice amount before
        System.out.printf("Invoice 2 amount: %.2f%n", invoice2.getInvoicAmount());
 
        invoice2.setNumber("004393");
        invoice2.setDescription("blue book");
        invoice2.setQuantity(200);
        invoice2.setItem(41.89);
 
        // invoice after
        System.out.printf("Invoice 2: %s\t%s\t%d\t%.2f\n", invoice2.getNumber(), invoice2.getDescription(), invoice2.getQuantity(), invoice2.getItem());       

        // invoice amount after
        System.out.printf("Invoice 2 amount: %.2f%n", invoice2.getInvoicAmount());

    }

}
