package lab_4;

public class FinalExam extends Exam {

    public FinalExam(double maxMark, DateTime dateTime) {

        super("Final Exam", maxMark, dateTime);

    }

    @Override
    public String toString() {

        return String.format("Exam: %s (%.2f marks)%n%s%n", "Final Exam", super.getMaxMark(), super.getDateTime());

    }

}
