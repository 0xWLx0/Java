package lab_3;

import java.util.*;

public class LibraryTest {
    
    public static void main(String[] args) {

        // book 1
        Author author0 = new Author("ali", "ali@gamil.com");
        Book book0 = new Book("Ali live", author0, 250);

        // book 2
        Author author1 = new Author("Ahmed", "Ahmed@gamil.com");
        Book book1 = new Book("How To Program in python", author1, 780);

        // book 3
        Author author2 = new Author("Hakim", "Hakim@gamil.com");
        Book book2 = new Book("How To Program in Java", author2, 1080);


        // creat array of books
        Book[] books = {book0, book1, book2};
        Library library = new Library(books);

        // print the array of books
        System.out.println("Library 1: \n" + library);

        // find a book
        Book wantedBook = library.findBook("How to Program in Java");
        if(wantedBook == null)
            System.out.println("Book not found");

        else
            System.out.println("The book you searched for is: " + wantedBook);


        // book4
        Author author3 = new Author("Muhmmad", "Muhmmad@gmail.com");
        Book book3 = new Book("How to program in php", author3, 1507);

        // try to add a book
        library.addBook(book3);  // uncomment this and it will give an error

        System.out.println();

        // ------------------------
        // creating a library using scanner

        Scanner input = new Scanner(System.in);

        // take the size from the user
        System.out.print("Enter Size of the library: ");
        int size = input.nextInt();


        // create another library
        Library library2 = new Library(size);

        // add books to the library2 
        System.out.print("Enter the number of books you want to add: ");
        int wantToAdd = input.nextInt();
        if(wantToAdd > size)
            throw new IllegalAccessError("The number of books you want to add must be less or equal to " + size);

        // order to follow
        System.out.print("\nOrder to follow while entering the books:\nTitle authorName authorEmail numberOfBages\nUse Caml case for title and author name.\n");

        String title; 
        String authorName; 
        String authorEmail;
        int numberOfBages;
        for(int i = 0; i < wantToAdd; i++) {

            System.out.println("\nEnter book no. " + (i + 1) + ":");
            title = input.next();
            authorName = input.next();
            authorEmail = input.next();
            numberOfBages = input.nextInt();

            library2.addBook(new Book(title, new Author(authorName, authorEmail), numberOfBages));

        }

        // search for a book from the user by the title
        System.out.print("The title of a book you want to search for: ");
        wantedBook = library2.findBook(input.next());

        if(wantedBook == null)
            System.out.println("Book not found");

        else
            System.out.println("Enter the book you searched for is: " + wantedBook);

        // library2
        System.out.println("Library 2: \n" + library2);
   
        
    }

}
