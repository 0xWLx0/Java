package Evaluation2;

public class PersonTest {
    
    public static void main(String[] args) {

        Person obj1 = new Student("Ali", "Computer Science", 4.75);
        Person obj2 = new Employee("Mohammed", "Accounting", "Accountant");

        System.out.println(obj1.getInfo());
        System.out.println(obj2.getInfo());
        
    }

}
