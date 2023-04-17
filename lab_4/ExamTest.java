package lab_4;

public class ExamTest {

    public static void main(String[] args) {

        // test 1
        DateTime exDateTime1 = new DateTime(13, 7, 1439, 8, 0);
        Exam exam1 = new Exam("Lab Exam", 8, exDateTime1);

        System.out.println(exam1);
        System.out.println(exam1.getExamStatus());
        System.out.println();

        // test 2
        DateTime exDateTime2 = new DateTime(13, 8, 1439, 8, 0);
        MidtermExam exam2 = new MidtermExam(18, exDateTime2);

        System.out.println(exam2);
        System.out.println(exam2.getExamStatus());
        System.out.println();

        // test 3
        DateTime exDateTime3 = new DateTime(20, 7, 1439, 8, 0);
        FinalExam exam3 = new FinalExam(8, exDateTime3);

        System.out.println(exam3);
        System.out.println(exam3.getExamStatus());

    }

}
