package lab_3.exe_1_2;

public class BookTest {
    
    public static void main(String[] args) {
        
        Author author = new Author("deitel", "deitel@deitel.com");
        Book book = new Book("Java How To Program", author, 1245);

        System.out.println(book);
        
    }

}
