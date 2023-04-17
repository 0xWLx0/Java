package project_6;

public class Main {
    
    public static void main(String[] args) {

        // emplyee 1
        Employees employee_1 = new Employees("Robert", "De", "1121378906", 4);

        System.out.printf("Employee 1:%nFirst Name: %s%nLastName: %s%nID: %s%nYears of experience: %d%nLevel: %s%n%n", employee_1.getFName(), employee_1.getLName(), employee_1.getID(), employee_1.getYearsExp(), employee_1.level(employee_1.getYearsExp()));


        // emplyee 2
        Employees employee_2 = new Employees("Sam", "Ali", "1189778906", 3);

        System.out.printf("Employee 2:%nFirst Name: %s%nLastName: %s%nID: %s%nYears of experience: %d%nLevel: %s%n%n", employee_2.getFName(), employee_2.getLName(), employee_2.getID(), employee_2.getYearsExp(), employee_2.level(employee_2.getYearsExp()));


        // emplyee 3
        Employees employee_3 = new Employees("John", "Ripper", "1121008906", 7);

        System.out.printf("Employee 3:%nFirst Name: %s%nLastName: %s%nID: %s%nYears of experience: %d%nLevel: %s%n%n", employee_3.getFName(), employee_3.getLName(), employee_3.getID(), employee_3.getYearsExp(), employee_3.level(employee_3.getYearsExp()));
        
    }

}
