package empolyee;

public abstract  class Employee  {
    private int id;
    private String name;
    private double baseSalary;

    private static  int employeeCount = 0;

    public Employee(int id, double baseSalary, String name) {
        this.id = id;
        this.baseSalary = baseSalary;
        this.name = name;
        employeeCount++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }


    public abstract double calculateSalary();

    public void displayInfo(){
        System.out.println("ID = " + id);
        System.out.println("Name:" + name);
        System.out.println("BaseSalary:" + baseSalary);
    }
}
