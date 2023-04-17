package Evaluation2;

public class Employee extends Person {
    
    private String jobTitle;

    public Employee(String name, String dept, String jobTitle) {

        super(name, dept);

        this.jobTitle = jobTitle;

    }

    @Override 
    public String getInfo() {

        return String.format("Name: %s, his department is %s, and job title is %s", super.getName(), super.getDept(), jobTitle);

    } 

}
