package Evaluation2;

public class Student extends Person {
    
    private double GPA;

    public Student(String name, String dept, double GPA) {

        super(name, dept);

        this.GPA = GPA;

    }
 
    public String getInfo() {

        return String.format("Name: %s, his department is %s, and GPA is %.2f", super.getName(), super.getDept(), GPA);

    } 

}
