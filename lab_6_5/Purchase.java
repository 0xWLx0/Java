package lab_6_5;

import java.util.Arrays;

public class Purchase {

    // instance variables
    private SalableBook[] salableBooks;
    private int numBooks;
    private  String purchaseDate;

    public Purchase(int numBooks, String purchaseDate) {

        salableBooks = new SalableBook[numBooks];
        this.purchaseDate = purchaseDate;

    }

    public void addBook(SalableBook salableBook) {

        if(numBooks < salableBooks.length)
            salableBooks[numBooks++] = salableBook;

        else
            System.out.println("Purchase is full. Cannot add more books!");

    }

    public SalableBook getBook(int position) {

        for(int i = 0; i < salableBooks.length; i++) {

            if(i == position)
                return salableBooks[position];


        }

        return null;

    }

    public int sumup() {

        int total = 0;
        
        for(SalableBook salableBook: salableBooks)
            total += salableBook.getPrice();

        return total;

    }

    public String getInfo(int index) {

        SalableBook Book = getBook(index);

        if(Book instanceof PaperBook)
            return "weight: " + ((PaperBook)(Book)).getWeight() + ", quantity: " + ((PaperBook)(Book)).getQuantity();

        else
            return "size: " + ((ElectronicBook) (Book)).getSize() + ", URL: " + ((ElectronicBook)(Book)).getDownloadUrl();
    
    }

    @Override
    public String toString() {
        return "Purchase [salableBooks=" + Arrays.toString(salableBooks) + ", numBooks=" + numBooks + ", purchaseDate="
                + purchaseDate + "]";
    }
    
}
