package project_10;

public class Product {

    private String product;
    private double price;

    private static double total = 0.0;
    private static double totalAfterTax = 0.0;

    private static double profitRate = 0.0;
    private static double lossRate = 0.0;
    private static double profit = 0.0;
    private static double loss = 0.0;

    Product() {

        this(null, 0.0);

    }
   
    Product(String product, double price) {

        this.product = product;
        this.price = price;

        Product.total += getPriceAfterDiscount(product, price); 
        Product.totalAfterTax = total + tax(total);

        Product.profit += (getPriceAfterDiscount(product, price) - price) > 0.0 ? (getPriceAfterDiscount(product, price) - price) : 0.0;

        Product.loss += (getPriceAfterDiscount(product, price) - price) < 0.0 ? (getPriceAfterDiscount(product, price) - price) : 0.0;

        Product.profitRate += (((getPriceAfterDiscount(product, price) - price) > 0.0 ? (getPriceAfterDiscount(product, price) - price) : 0.0) / ((price > 0.0) ? price : 1.0)) * 100;

        Product.lossRate += (((getPriceAfterDiscount(product, price) - price) < 0.0 ? (getPriceAfterDiscount(product, price) - price) : 0.0) / ((price > 0.0) ? price : 1.0)) * 100;

    }

    // get the price after the discount
    public double getPriceAfterDiscount(String product, double price) {

        return Discount(product, price);

    }

    // apply the discount
    private double Discount(String product, double price) {
        
        if(product.equalsIgnoreCase("T-shirt"))
            return price - (price * .15);
        else if (product.equalsIgnoreCase("Pans"))
            return price - (price * .5);
        else if(product.equalsIgnoreCase("Jacket"))
            return price - (price * .10);
        else if (product.equalsIgnoreCase("Shoes"))
            return price + (price * .03);

        return price;

    }

    // count the tax for any price
    public double tax(double price) {

        return price * .10;

    }

    // get the product
    public String getProduct() {
        return product;
    }

    // get the price
    public double getPrice() {
        return price;
    }

    // get the total with out the tax
    public double getTotal() {

        return total;

    }

    // get the total after tax
    public static double getTotalAfterTax() {
        return totalAfterTax;
    }

    // get the profit
    public double getProfit() {
        return profit;
    }

    // get the loss
    public double getLoss() {

        return loss;

    }

    // get the profit rate
    public static double getProfitRate() {

        return profitRate;

    }

    // get the loss rate
    public static double getLossRate() {
        
        return lossRate;

    } 
    
}
