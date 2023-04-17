package lab_4;

public class DateTime {

    // instance variables
    private int day, month, year, hour, minutes;

    public DateTime(int day, int month, int year, int hour, int minutes) {

        if (day < 1 || day > 31)
            throw new IllegalArgumentException("The day must be b/t 1 and 31.");

        if (month < 1 || month > 12)
            throw new IllegalArgumentException("The month must be b/t 1 and 12.");

        if (year < 0)
            throw new IllegalArgumentException("The year must be grater than 0.");

        if (hour < 0 || hour > 24)
            throw new IllegalArgumentException("The hour must be b/t 1 and 24.");

        if (minutes < 0 || minutes > 60)
            throw new IllegalArgumentException("The minutes must be b/t 0 and 60.");

        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;

    }

    public void setDate(int day, int month, int year) {

        if (day < 1 || day > 31)
            throw new IllegalArgumentException("The day must be b/t 1 and 31.");

        if (month < 1 || month > 12)
            throw new IllegalArgumentException("The month must be b/t 1 and 12.");

        if (year < 0)
            throw new IllegalArgumentException("The year must be grater than 0.");

        this.day = day;
        this.month = month;
        this.year = year;

    }

    public String getDate() {

        return String.format("Date: %d/%d/%d", day, month, year);

    }

    public String getTime() {

        return String.format("Time: %02d:%02d", hour, minutes);

    }

    public void setTime(int hour, int minutes) {

        if (hour < 0 || hour > 24)
            throw new IllegalArgumentException("The hour must be b/t 1 and 24.");

        if (minutes < 1 || minutes > 60)
            throw new IllegalArgumentException("The minutes must be b/t 1 and 60.");

        this.hour = hour;
        this.minutes = minutes;

    }

    @Override
    public String toString() {

        return String.format("%s%n%s", getDate(), getTime());

    }

}
