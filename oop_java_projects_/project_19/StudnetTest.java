package project_19;
public class StudnetTest {

    public static void main(String[] args) {

        Student<Integer> student_1 = new Student<>(2);

        student_1.addGrade(1);
        student_1.addGrade(2);
        student_1.addGrade(3);


        Student<String> student_2 = new Student<>(3);

        student_2.addGrade("A");
        student_2.addGrade("B");

        System.out.print("Student 1: ");

        for(Object element: student_1.getGrades()) {

            if(element != null)
                System.out.print(element + " ");

        }

        System.out.println();

        System.out.print("Student 2: ");
        for(Object element: student_2.getGrades()) {

            if(element != null)
                System.out.print(element + " ");

        }

        System.out.println();
        
    }
    
}
