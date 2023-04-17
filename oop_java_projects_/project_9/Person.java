package project_9;

public class Person {
    //instance variables
    private String name; 
    private int age; 
   
    // no args constructor
    public Person(){
        this("AD", 0);
        System.out.println("No args constructor"); 
    }

    public Person(String name){
        this(name, 0);
    }
    public Person(int age){
        this("AD", age);
    }
    public Person( String name, int age){

        System.out.println("Argument constructor");
        this.name= name;
        if(age>=0 ) 
            this.age = age; 
        else
        System.out.println("Age must be positive");
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }


    

    public void setName(String name){
        this.name = name; 
    }

    public String getName(){
        return name; 
    }

    public void setAge(int age){
        if( age > 0)
            this.age = age; 
        else 
         System.out.println("Age must be > 0 Please update");
    }

    public int getAge(){
        return age; 
    }
   
}
