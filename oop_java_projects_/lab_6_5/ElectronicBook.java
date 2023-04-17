package lab_6_5;

public class ElectronicBook extends SalableBook {

    // instance variables
    private int size;
    private String downloadUrl;

    // constructor
    public ElectronicBook(String title, Author author, String ISBN, int price, String category, int size, String downloadUrl) {

        super(title, author, ISBN, price, category);
        this.size = size;
        this.downloadUrl = downloadUrl;

    }

    // getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public boolean isAvailable() {

        if (downloadUrl == null)
            return false;

        return true;
        
    }

    @Override
    public double computeCost() {

        return super.getPrice() * size;

    }

    @Override
    public String toString() {
        return "ElectronicBook{" + "size=" + size + ", downloadUrl=" + downloadUrl + '}';
    }
 
}
