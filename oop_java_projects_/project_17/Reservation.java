package project_17;

public class Reservation {

    private String customerName;
    private Date date;
    private int duration;
    private int reservationNo;

    public Reservation(String customerName, Date date) {
    
        this.customerName = customerName;
        this.date = date;

    }

    public Reservation(String customerName, Date date, int duration) {

        this(customerName, date);
        this.duration = duration;

    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Reservation [customerName=" + customerName + ", date=" + date + ", duration=" + duration
                + ", reservationNo=" + reservationNo + "]";
    }

    
    
}
