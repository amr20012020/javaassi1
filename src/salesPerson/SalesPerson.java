package salesPerson;

import empolyee.Employee;

public class SalesPerson extends Employee {


    private double commission;

    public SalesPerson(int id, String name, double baseSalary, double commission) {
        super(id, baseSalary, name);
        this.commission = commission;
    }

    public double getBonus(){
        return commission;
    }

    public void setBonus(double bonus){
        this.commission = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getBonus();
    }
}
