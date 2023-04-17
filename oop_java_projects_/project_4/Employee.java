package project_4;

public class Employee {
    
    // variables
    private String f_name, l_name;
    private double salary;

    // a constructor that take three arguments
    Employee(String f_name, String l_name, double salary) {

        this.f_name = f_name;
        this.l_name = l_name;
        this.salary = (salary > 0.0)? salary: 0.0;

    }

    public String getFName() {

        return f_name;

    }

    public void setFName(String f_name) {

        this.f_name = f_name;

    }

    public String getLName() {

        return l_name;

    }

    public void setLName(String l_name) {

        this.l_name = l_name;

    }

    public double getSalary() {

        return salary;

    }

    public void setSalary(double salary) {

        this.salary = salary;

    }

}
