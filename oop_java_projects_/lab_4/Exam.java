package lab_4;

public class Exam {

    // instance variables
    private final String type;
    private double maxMark = 0.0;
    private DateTime dateTime;

    // class variables
    private final static String[] types = { "Lab Exam", "Midterm Exam", "Final Exam" };
    private static int orderLab = 0, orderMid = 0;

    // defualt constructor
    public Exam() {

        this(null, 0.0, null);

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

    public Exam(String type, double maxkMark, DateTime dateTime) {

        this(type, maxkMark);

        this.dateTime = dateTime;

    }

    // constructor
    public Exam(Exam exam) {

        this(exam.type, exam.maxMark, exam.dateTime);

    }

    public DateTime getDateTime() {

        return dateTime;

    }

    public double getMaxMark() {

        return maxMark;

    }

    public String getExamStatus() {

        return String.format("Lab Exam: %d exam(s)%nMidterm: %d exam(s)", orderLab, orderMid);

    }

    @Override
    public String toString() {

        return String.format("Exam: %s (%.2f marks)%n%s%n", type, maxMark, dateTime);

    }

}
