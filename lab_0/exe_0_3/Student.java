package lab_0.exe_0_3;

public class Student {
    
    private String name;
    private int age;

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public int getAge() {

        return age;

    }

    @Override
    public String toString() {

        return "Student name is {" + name + "} and he/she is {" +  age + "} years old";

    }

}