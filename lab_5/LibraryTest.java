package lab_5;

public class LibraryTest {
    
    public static void main (String args[]) {
    
        // creat library with size 8
        Library library = new Library (8);
        
        // add 10 books to the library
        library.addBook(new ReferenceBook ("Problems for Computer Solution using BASIC", new Author("Henry M. Walker", "walker@books.com"), "0-87626-717-7", "QA76.73.B3W335", "Iowa Room"));
        library.addBook(new ReferenceBook ("Experiments in Java", new Author("Samuel A. Rebelsky", "Rebelsky@books.com"), "0201612674", "64.2 R25ex", "Iowa Room"));
        library.addBook(new CirculatingBook ("Algorithms for functional programming", new Author("John David Stone", "stone@books.com"), "in process", "forthcoming"));
        library.addBook(new CirculatingBook ("Computer Science 2:  Principles of Software Engineering, Data Types, and Algorithms", new Author("Henry M. Walker","walker@books.com"), "0-673-39829-3", "QA76.758.W35"));
        library.addBook(new CirculatingBook ("Problems for Computer Solution using FORTRAN", new Author("John David Stone", "stone@books.com"), "0-87626-654-5", "QA43.W34"));
        library.addBook(new CirculatingBook ("Introduction to Computing and Computer Science with Pascal", new Author("Henry M. Walker","walker@books.com"), "0-316-91841-5", "QA76.6.W3275"));
        library.addBook(new CirculatingBook ("ED-MEDIA 2002 : World Conference on Educational Multimedia, Hypermedia & Telecommunications", new Author("Samuel A. Rebelsky", "Rebelsky@books.com"), "14. 1-880094-45-2", "64.2 25e"));
        library.addBook(new CirculatingBook ("Pascal:  Problem Solving and Structured Program Design", new Author("Henry M. Walker","walker@books.com"),"0-316-91848-2", "QA76.73.P2W35"));
        library.addBook(new CirculatingBook ("The Limits of Computing", new Author("Henry M. Walker","walker@books.com"),"0-7637-2552-8", "QA76.W185"));
        library.addBook(new CirculatingBook ("The Tao of Computing", new Author("Henry M. Walker","walker@books.com"), "0-86720-206-8", "QA76.W1855"));
        
        // call toString method of library
        System.out.println(library);
        
        // checkouts
        library.checkout("Donald Duck", "March 1, 2012", "QA43.W34");
        library.checkout("Donald Duck", "March 12, 2012", "QA76.6.W3275");
        library.checkout("Donald Duck", "March 6, 2012", "64.2 R25ex");
        library.checkout("Minnie Mouse", "April 1, 2012", "QA76.73.P2W35");
        // must fail because 12345 doesn't exist
        library.checkout("Goofy", "February 28, 2012", "12345"); // should fail
        
        // return the order "QA43.W34" and "QA76.73.P2W35"
        library.returned("QA43.W34");
        library.returned("QA76.73.P2W35");
        
        // now the checkout should work becouse "QA76.73.B3W335" is available
        library.checkout("Goofy", "March 28, 2012", "QA76.73.P2W35"); 
        library.checkout("Goofy", "February 28, 2012", "QA43.W34"); 
        
        // call toString method of library after all the checkouts and returns
        System.out.println(library);
    }

}
