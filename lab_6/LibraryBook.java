package lab_6;

public abstract class LibraryBook extends Book {
    private final String orderNumber;

    public LibraryBook(String title, Author author, String ISBN, String orderNumber) {
        super(title, author, ISBN);
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public abstract void checkout(String borrowerName, String dueDate);

    public abstract void returned();

    public abstract String getStatus();

    @Override
    public String toString() {
        return String.format("LibraryBook[%s, order number=%s, status=%s]", super.toString(), getOrderNumber(),
                getStatus());
    }
}
