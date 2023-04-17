package lab_3;

public class Book {
    
    private final String title;
    private final int number_pp;
    private final Author author;

    public Book(String title, Author author, int number_pp) {

        this.author = author;
        this.title = title;
        this.number_pp = number_pp;

    }

    public String getTitle() {
        return title;
    }

    public int getNumber_pp() {
        return number_pp;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {

        return String.format("\"%s\"", title) + " " + author + String.format(", pp %d", number_pp);

    }

}
