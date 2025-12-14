package intern;

import empolyee.Employee;

public class Intern extends Employee {

    public Intern(int id,String name) {
        super(id, 0, name);
    }

    @Override
    public double calculateSalary() {
        return 3000;
    }
}
