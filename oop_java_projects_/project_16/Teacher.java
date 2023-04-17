package project_16;

public class Teacher extends Person {

    public Teacher(String name, int age, int iD) {
        super(name, age, iD);
    }

    @Override
    public void workstat() {
        System.out.println("from 7:30");
        
    }

    @Override
    public String toString() {
        return "Teacher " + super.toString();
    } 
    
}
