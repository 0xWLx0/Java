package project_16;

public class Employer extends Person {

    public Employer(String name, int age, int iD) {
        super(name, age, iD);
    }

    @Override
    public void workstat() {
        System.out.println("from 9:00");
        
    }

    @Override
    public String toString() {
        return "Student " + super.toString();
    } 
    
}
