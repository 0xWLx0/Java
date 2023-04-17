package project_8;

public class Main {
    
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("ali");
        student.setAge(23);

        // System.out.println(student.toString());

        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());

    }

}
