import java.util.Scanner;

public class homework4 {

    public class Employee {
        int employeeId;
        String name;
        double salary;

        // Method to input data
        void input() {
            Scanner in = new Scanner(System.in);
 
            System.out.print("Enter Employee ID: ");
            employeeId = in.nextInt();

            System.out.print("Enter Employee Name: ");
            name = in.next();

            System.out.print("Enter Employee Salary: ");
            salary = in.nextDouble();
        }

        // Method to output data
        void output() {
            System.out.println();
            System.out.println("Employee ID : " + employeeId);
            System.out.println("Name : " + name);
            System.out.println("Salary : $" + salary);
        }
    }

    public static void main(String[] args) {
        homework4 app = new homework4();
        Employee emp = app.new Employee();

        emp.input();   
        emp.output();  
    }
}
