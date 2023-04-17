package lab_3;

public class Library {
    
    // instance variables
    private Book[] books;
    private int numberOfBooks;

    public Library(int numberOfBooks) {

        this.books = new Book[numberOfBooks];

    }

    public Library(Book[] books) {

        this.numberOfBooks = books.length;
        this.books = books;

    }

    public void addBook(Book book) {

        if(numberOfBooks < books.length) {

            books[numberOfBooks] = book;
            numberOfBooks++;

        }
        else 
            System.out.println("The library is full you can't add more books.");

        

        // int index;

        // for(index = 0; index < this.books.length; index++) {

        //     if(this.books[index] == null) {

        //         this.books[index] = book;
        //         break;

        //     }

        // }

        // if(index == this.books.length)
        //     throw new IllegalAccessError("Sorry the library is full you can't add a new book to this library!"); 

        // this.numberOfBooks++;

    }

    public Book findBook(String title) {

        for(int index = 0; index < this.books.length; index++) {

            if(this.books[index].getTitle().equalsIgnoreCase(title))
                return this.books[index];

        }

        return null;

    }

    @Override
    public String toString() {

       String toString = ""; 

       for(int i = 0; i < books.length; i++) {

            if(books[i] == null)
                break;

            toString += String.format("%s %n", books[i]);

       }

       return "Books:\n" + toString + "Number of Books: " + numberOfBooks;
    }

}
