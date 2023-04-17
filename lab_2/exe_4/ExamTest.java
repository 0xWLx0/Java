public class ExamTest {

    public static void main(String[] args) {

        Exam exam = new Exam("Final Exam", 40.0, 13, 8, 1439, 8, 0);

        System.out.println(exam);
        System.out.println(exam.getExamStatus());
        System.out.println();

        Exam exam2 = new Exam("Midterm Exam", 15, 13, 7, 1439, 8, 0);

        System.out.println(exam2);
        System.out.println(exam2.getExamStatus());
        System.out.println();

        Exam exam3 = new Exam("Lab Exam", 8, 20, 7, 1439, 8, 0);

        System.out.println(exam3);
        System.out.println(exam3.getExamStatus());

    }

}
