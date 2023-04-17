package project_15;

public class Tester {

    public static void main(String[] args) {

        Product[] products = new Product[3];

        Ibook ibook1 = new Ibook(443, "Abdulhakim.com"); // 443
        PaperBook paperBook = new PaperBook(16, 222);   // 016
        Ibook ibook2 = new Ibook(750, "Almomen.com"); // 750

        products[0] = ibook1;
        products[1] = paperBook;
        products[2] = ibook2;

        genericMethod(products);
        
    }

    public static <T extends Product> void genericMethod(T[] products) {

        double total = 0;

        for(T book: products) {

            System.out.println(book);

            if(book instanceof Ibook) {

                System.out.printf("(The difference: %.1f SR.)%n" , ((Ibook)(book)).computeAmount());
                total += ((Ibook)(book)).getPrice();

            }
            else {

                total += book.getPrice();

            }

        }

        System.out.printf("In total, you pay: %.1f SR.%n",total);

    }
    
}
