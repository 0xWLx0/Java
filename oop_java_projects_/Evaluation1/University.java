package Evaluation1;

public class University {

    // instance variables
    private String collage;
    private int students;
    private double budget;

    // defualt con
    public University() {

        this(null, 0, 0.0);

    }

    // second con
    public University(String collage, int students, double budget) {

        this.collage = collage;
        this.students = students;
        this.budget =  budget;

    }

    // getter
    public double getBudget() {
        return budget;
    }

    // setter
    public void setBudget(double budget) {
        this.budget = budget;
    }

    // toString method
    @Override
    public String toString() {

        return String.format("Collage name is %s%nStudents number = %d%nThe budget = %.1f", collage, students, budget);

    } 
    
}
