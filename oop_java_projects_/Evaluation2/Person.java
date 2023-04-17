package Evaluation2;

public class Person {
    
    private String name;
    private String dept;

    public Person(String name, String dept) {

        this.name = name;
        this.dept = dept;

    }

    public String getInfo() {

        return String.format("Name: %s, his department is %s", name, dept);

    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    } 

    

}
