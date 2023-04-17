package project_16;

public class Tester {

    public static void main(String[] args) {

        Person[] person = new Person[3];

        person[0] = new Student("My cat", 3, 5);
        person[1] = new Student("My cat", 3, 5);
        person[2] = new Student("My cat", 3, 5);

        for(int i = 0; i < person.length; i++) {

            person[i].workstat();

        }
        
    }
    
}
