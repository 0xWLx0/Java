package lab_0.exe_0_2;

import java.util.Scanner;

public class StudentTest {
    
    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        Student student_1 = new Student();

        // take the name
        System.out.print("Enter name: ");
        student_1.setName(input.nextLine());

        // take the age
        System.out.print("Enter age: ");
        student_1.setAge(input.nextInt());

        // print the name and the age
        System.out.printf("Student name is %s and he/she is %d years old%n", student_1.getName(), student_1.getAge());

    }

}
