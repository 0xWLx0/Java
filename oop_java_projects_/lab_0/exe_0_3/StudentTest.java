package lab_0.exe_0_3;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Student student_1 = new Student();

        // take the name
        System.out.print("Enter name: ");
        student_1.setName(input.nextLine());

        // take the age
        System.out.print("Enter age: ");
        student_1.setAge(input.nextInt());

        // print toString method using the object
        System.out.println(student_1);

    }
    
}
