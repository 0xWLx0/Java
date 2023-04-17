package project_4;

public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Employee employee_1 = new Employee("Mohamed", "Ali", 20000.00);
        Employee employee_2 = new Employee("Ahmed", "Ibrahim", 50000.00);

        System.out.printf("First Name: %s\tLast Name: %s\tSalary: %.2f%n", employee_1.getFName(), employee_1.getLName(), employee_1.getSalary());
        System.out.printf("First Name: %s\tLast Name: %s\tSalary: %.2f%n", employee_2.getFName(), employee_2.getLName(), employee_2.getSalary());

        // set 10% rise
        employee_1.setSalary((0.1 * employee_1.getSalary()) + employee_1.getSalary());
        employee_2.setSalary((0.1 * employee_2.getSalary()) + employee_2.getSalary());

        System.out.printf("First Name: %s\tLast Name: %s\tSalary: %.2f%n", employee_1.getFName(), employee_1.getLName(), employee_1.getSalary());
        System.out.printf("First Name: %s\tLast Name: %s\tSalary: %.2f%n", employee_2.getFName(), employee_2.getLName(), employee_2.getSalary());

    }

}
