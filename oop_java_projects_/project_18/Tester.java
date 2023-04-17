package project_18;

public class Tester {

    public static void main(String[] args) {

        Department department = new Department("CS");
        Student student = new Student(1);

        Manageable[] manageables = new Manageable[2];

        manageables[0] = department;
        manageables[1] = student;

        for(int i = 0; i < manageables.length; i++) {

            manageables[i].addCourse("Java");

        }

        for(Manageable manageable: manageables) {

            if(manageable instanceof Department)
                ((Department)(manageable)).addCourse("Math");

            if(manageable instanceof Student)
                ((Student)(manageable)).displayNum();
            

        }
        
    }
    
}
