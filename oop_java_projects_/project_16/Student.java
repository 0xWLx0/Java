package project_16;

public class Student extends Person {

    public Student(String name, int age, int iD) {
        super(name, age, iD);
    }

    @Override
    public void workstat() {
        System.out.println("from 8:00");
        
    }

    @Override
    public String toString() {
        return "Student " + super.toString();
    } 
    
}
