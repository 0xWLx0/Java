package project_18;

public final class Department implements Manageable{

    private final String name; 
    private String courses[];
    private int num;

    public Department(String name) {

        this.courses = new String[10];
        this.name = name;
        num = 0;

    }

    @Override
    public void addCourse(String name) {


        if(num < 10) {

            courses[num++] =  name;
            System.out.println("Subject " + this.name + "_" + name + " added to " + this.name + " departemnt");

        }        

    }
    
}
