package lab_4;

public class MidtermExam extends Exam {

    public MidtermExam(int maxkMark, DateTime dateTime) {

        super("Midterm Exam", maxkMark, dateTime);

    }

    @Override
    public String toString() {

        return String.format("Exam: %s (%.2f marks)%n%s%n", "Midterm Exam", super.getMaxMark(), super.getDateTime());

    }
}
