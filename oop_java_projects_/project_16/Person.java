package project_16;

public abstract class Person {

    private String name;
    private int age;
    private int ID;

    public Person(String name, int age, int iD) {
        this.name = name;
        this.age = age;
        ID = iD;
    }

    public abstract void workstat();

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + ", ID=" + ID + "]";
    }

    
    
}
