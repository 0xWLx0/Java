package project_18;

public class Student implements Manageable {

    private final int ID;
    private String courses[];
    private int num;

    public Student(int ID) {

        this.ID = ID;
        this.courses = new String[5];
        num = 0;

    }

    @Override
    public void addCourse(String name) {

        if(num < 5) {

            courses[num++] = name;
            System.out.println("Subject " + name + " added to student " + ID);

        }

    }

    public void displayNum() {

        System.out.println("Studnet " + ID + " has " + num + " course(s)");

    }
    
}
