import empolyee.Employee;
import intern.Intern;
import manager.Manager;
import salesPerson.SalesPerson;

import java.util.ArrayList;
import java.util.Scanner;

public class BusinessSystem {


    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        employees.add(new Manager(1, "Ahmed", 10000, 3000));
        employees.add(new SalesPerson(2, "Sara", 8000, 2000));
        employees.add(new Intern(3, "Omar"));


        for(Employee emp: employees){
            emp.displayInfo();
            System.out.println("Final Salary: " + emp.calculateSalary());

            if (emp instanceof Manager){
                System.out.println("Role: Manager");
            }
            else if (emp instanceof SalesPerson){
                System.out.println("Role: Sales Person");
            }
            else if (emp instanceof Intern){
                System.out.println("Role: Intern");
            }

            System.out.println("----------------------");
        }
        System.out.println("Total Employees Created: " + Employee.getEmployeeCount());
    }
}