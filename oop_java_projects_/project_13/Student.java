package project_13;

public class Student {

    // instance variables
    private Course objCourse;
    private int ID;
    private String name;

    // class variables
    private final static String noName = "onyone";
    private static int counter = 1000;

    // defualt
    public Student() {

        this(null, noName);

    }

    public Student(Course objCourse, String name) {

        this.objCourse = objCourse;
        this.name = name;
        ID = counter++;

    }

    // update the contents of the object objCourse
    public void updateCourse(String name, int hour) {

        if (hour > 2) {

            objCourse = new Course(name, hour);
            System.out.println("The course " + name + " is added successfully");

        }

        else
            System.out.println("Cannot add the course " + name);

    }

    public static int getNumStudent() {

        return counter - 1000;

    }

    public String getStudentName() {

        return name;

    }

    public int getID() {

        return ID;

    }

    public String toString() {

        return String.format("%s(ID: %d) studies %s in %d hours", name, ID, objCourse.getNameCourse(),
                objCourse.getHour());

    }

}