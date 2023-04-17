package project_19;

public class Student <T> {

    public T[] Grades;

    public Student(int numOfStudent) {

        this.Grades = (T[])(new Object[numOfStudent]);

    }

    public Object[] getGrades() {

        return Grades;

    }

    public void addGrade (T element) {

        int i;
        
        for(i = 0; i < Grades.length;) {

            if(Grades[i] == null) {

                Grades[i] = element;
                break;

            }

            i++;

        }

        if(i == Grades.length)
            System.out.println("You can't add more grades.");


    }
    
}
