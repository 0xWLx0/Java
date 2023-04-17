package lab_5;

public class Library {
    
    // instance variables
    private LibraryBook[] books;
    private int numberOfBooks;

    public Library(int numberOfBooks) {

        this.books = new LibraryBook[numberOfBooks];

    }

    public Library(LibraryBook[] books) {

        this.numberOfBooks = books.length;
        this.books = books;

    }

    public void addBook(LibraryBook book) {

        // if(this.numberOfBooks < books.length)
        //     books[numberOfBooks++] = book;

        // else 
        //     System.out.println("The library is full you can't add more books!");

        

        int index;

        for(index = 0; index < this.books.length; index++) {

            if(this.books[index] == null) {

                this.books[index] = book;
                this.numberOfBooks++;
                break;

            }

        }

        if(index == this.books.length)
            System.out.println("Sorry the library is full you can't add a new book to this library!"); 

       

    }

    public LibraryBook findBook(String orderNumber) {

        for(int index = 0; index < this.books.length; index++) {

            if(this.books[index].getOrderNumber().equalsIgnoreCase(orderNumber))
                return this.books[index];

        }

        return null;

    }

    public void checkout(String borrowerName, String dueDate, String orderNumber) {

        LibraryBook findBook = findBook(orderNumber);

        if(findBook != null) 
            findBook.checkout(borrowerName, dueDate);

        else
            System.out.println("Order: " + orderNumber + " is not found!");

    }

    public void returned(String orderNumber) {

        LibraryBook findBook = findBook(orderNumber);

        if(findBook != null) 
            findBook.returned();

        else
            System.out.println("Order: " + orderNumber + "\n is not found!");

    }

    @Override
    public String toString() {

       String toString = ""; 

       for(int i = 0; i < books.length; i++) {

            if(books[i] == null)
                break;

            toString += String.format("%s %n", books[i]);

       }

       return "LibraryBooks:\n" + toString + "Number of Books: " + numberOfBooks;
    }

}
