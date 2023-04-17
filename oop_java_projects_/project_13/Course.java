package project_13;

public class Course {

    private String nameCourse;
    private int hour;

    public Course() {

        this(null, 0);

    }

    public Course(String nameCourse, int hour) {

        this.nameCourse = nameCourse;
        this.hour = hour;

    }

    public String getNameCourse() {
        return nameCourse;
    }

    public int getHour() {
        return hour;
    }
   
}