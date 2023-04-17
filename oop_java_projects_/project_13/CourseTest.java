package project_13;

public class CourseTest {
    
    public static void main(String[] args) {

        Course course = new Course("Computer Science", 4);

        Student student1 = new Student(course, "Ali");
        Student student2 = new Student(course, "Muhammed");

        System.out.println("The university has " + Student.getNumStudent() + " student(s): ");

        System.out.println(student1);
        System.out.println(student2);

        student1.updateCourse("Math", 2);
        student2.updateCourse("SAT", 3);
        
    }

}
