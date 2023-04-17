package lab_5;

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("Object Oriented Programming Using Java", new Author("danial", "danial@gmail.com"), "9086 5024 1683");

        // call toString method
        System.out.println(book);

        LibraryBook libraryBook = new LibraryBook("Object Oriented Programming Using Java", new Author("danial", "danial@gmail.com"), "9086 5024 1683", "00001");

        // call toString method
        System.out.println(libraryBook);
        // call checkout method 
        libraryBook.checkout(null, null);
        // call returned method
        libraryBook.returned();

        ReferenceBook referenceBook = new ReferenceBook("Object Oriented Programming Using Java", new Author("danial", "danial@gmail.com"), "9086 5024 168", "00002", "Computer Science");

        // call toString method 
        System.out.println(referenceBook);
        // call checkout method
        referenceBook.checkout(null, null);
        // call returned method
        referenceBook.returned();

        CirculatingBook circulatingBook = new CirculatingBook("Object Oriented Programming Using Java", new Author("danial", "danial@gmail.com"), "9086 5024 168", "00003");
         
        // call toString method
        System.out.println(circulatingBook);
        // call checout method with the borrower name and due date
        circulatingBook.checkout("Ali", "26/1/2023");
        // call toString after borrowing
        System.out.println(circulatingBook);
        // call returned method to return the book that ali borrowed
        circulatingBook.returned();
        // call toString after returning the book
        System.out.println(circulatingBook);

    }
    
}
