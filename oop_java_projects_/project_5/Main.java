package project_5;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student student_1 = new Student();

        // take the student name
        System.out.print("Enter the student name: ");
        student_1.setName(input.nextLine());

        // take the student age
        System.out.print("Enter the student age: ");
        student_1.setAge(input.nextInt());

        // take the student grade
        System.out.print("Enter the student grade: ");
        student_1.setGrade(input.nextDouble());

        // print the student information
        System.out.printf("Student name:%s %nStudent age: %d %nStudent grade:%.2f %n", student_1.getName(), student_1.getAge(), student_1.getGrade());
        
    }

}

class Student {

    private String name = " ";
    private int age = 0;
    private double grade = 0.0;

    
    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public int getAge() {

        return age;

    }
    
    public void setGrade(double grade) {

        this.grade = grade;

    }

    public double getGrade() {

        return grade;

    }

}
