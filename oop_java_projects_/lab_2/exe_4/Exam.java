public class Exam {

    // instance variables
    private int day, month, year, hour, minutes;
    private final String type;
    private double maxMark = 0.0;

    // class variables
    private final static String[] types = { "Lab Exam", "Midterm Exam", "Final Exam" };
    private static int orderLab = 0, orderMid = 0;

    // defualt constructor
    public Exam() {

        this(null, 0.0, 0, 0, 0, 0, 0);

    }
    //

    // constructor that take only the exam type
    public Exam(String type) {

        this.type = type;

        if (type.equalsIgnoreCase(types[0])) {

            orderLab++;

        }

        else if (type.equalsIgnoreCase(types[1])) {

            orderMid++;

        }

    }

    // constructor that take the max mark
    public Exam(String type, double maxMark) {

        this(type);

        if (type.equalsIgnoreCase(types[0]))
            this.maxMark = (maxMark <= 10 && maxMark >= 5) ? maxMark : 10.0;

        else if (type.equalsIgnoreCase(types[1]))
            this.maxMark = (maxMark <= 20 && maxMark >= 15) ? maxMark : 20;

        else if (type.equalsIgnoreCase(types[2]))
            this.maxMark = (maxMark <= 40 && maxMark >= 30) ? maxMark : 40.0;

        else
            this.maxMark = maxMark;

    }

    // constructor that take the day, month and year
    public Exam(String type, double maxMark, int day, int month, int year) {

        this(type, maxMark);

        this.day = (day <= 31 && day >= 1) ? day : 00;
        this.month = (month <= 12 && month >= 1) ? month : 00;
        this.year = (year > 0) ? year : 0000;

    }

    // constructor that take the hour and minutes
    public Exam(String type, double maxkMark, int day, int month, int year, int hour, int minutes) {

        this(type, maxkMark, day, month, year);

        this.hour = hour;
        this.minutes = minutes;

    }

    // constructor
    public Exam(Exam exam) {

        this(exam.type, exam.maxMark, exam.day, exam.month, exam.year, exam.hour, exam.minutes);

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public double getMaxMark() {

        return maxMark;

    }

    public String getDate(int day, int month, int year) {

        return String.format("Date: %d/%d/%d", day, month, year);

    }

    public void setDate(int day, int month, int year) {

        this.day = (day <= 31 && day >= 1) ? day : 00;
        this.month = (month <= 12 && month >= 1) ? month : 00;
        this.year = (year > 0) ? year : 0000;

    }

    public String getTime(int hour, int minutes) {

        return String.format("Time: %02d:%02d", hour, minutes);

    }

    public void setTime(int hour, int minutes) {

        this.hour = hour;
        this.minutes = minutes;

    }

    public String getExamStatus() {

        return String.format("Lab Exam: %d exam(s)%nMidterm: %d exam(s)", orderLab, orderMid);

    }

    @Override
    public String toString() {

        return String.format("Exam: %s (%.2f marks)%n%s%n%s%n", type, maxMark, getDate(day, month, year),
                getTime(hour, minutes));

    }

}
