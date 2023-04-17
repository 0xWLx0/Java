package project_10;

public class Main {
    
    public static void main(String[] args) {

        Product prodect_1 = new Product("T-shirt", 56.0);
        Product prodect_2 = new Product("Pans", 90.0);
        Product prodect_3 = new Product("Jacket", 43.0);
        Product prodect_4 = new Product("Shoes", 67.0);

        // printing the products and there prices
        System.out.printf("%-10s %-10s %-10s%n", "Product", "price", "price after discount or increase");
        System.out.printf("%s %10.2f %10.2f%n", prodect_1.getProduct(), prodect_1.getPrice(), prodect_1.getPriceAfterDiscount(prodect_1.getProduct(), prodect_1.getPrice()));
        System.out.printf("%s %10.2f %10.2f%n", prodect_2.getProduct(), prodect_2.getPrice(), prodect_2.getPriceAfterDiscount(prodect_2.getProduct(), prodect_2.getPrice()));
        System.out.printf("%s %10.2f %10.2f%n", prodect_3.getProduct(), prodect_3.getPrice(), prodect_3.getPriceAfterDiscount(prodect_3.getProduct(), prodect_3.getPrice()));
        System.out.printf("%s %10.2f %10.2f%n%n", prodect_4.getProduct(), prodect_4.getPrice(), prodect_4.getPriceAfterDiscount(prodect_4.getProduct(), prodect_4.getPrice()));

        // print the total after tax and the profit rate and the loss rate
        System.out.printf("The total price after tax is: %.2f%n", Product.getTotalAfterTax());
        System.out.printf("The profit rate: %.0f%c%n", Product.getProfitRate(), '%');
        System.out.printf("The loss rate: %.0f%c%n", Product.getLossRate(), '%');
        
    }

}