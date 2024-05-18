package Personel;

public class Manager extends Employee {

    private String department;

    public Manager(String firstName, String lastName, int yearsOfService, double salary, String department) {
        super(firstName, lastName, yearsOfService, salary);
        this.department = department;
    }

    public Manager(String firstName, String lastName, double salary, String department) {
        super(firstName, lastName, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Department: " + department);
    }
}

