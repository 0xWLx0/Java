package lab_0.exe_0_1;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student student_1 = new Student();

        System.out.print("Enter name: ");
        student_1.name = input.nextLine();;
        System.out.print("Enter age: ");
        student_1.age = input.nextInt();

        System.out.printf("Student name is %s and he/she is %d years old%n", student_1.name, student_1.age);

    }
    
}
