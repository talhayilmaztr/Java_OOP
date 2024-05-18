package Personel;

public class Employee {

    private String firstName;
    private String lastName;
    private int yearsOfService;
    private double salary;

    public Employee(String firstName, String lastName, int yearsOfService, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfService = yearsOfService;
        this.salary = salary;
    }
    
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public void giveRaise(int percentage) {
        if (percentage > 0) {
            salary += (salary * percentage) / 100;
        } else {
            System.out.println("Raise percentage must be greater than 0...");
        }
    }
    
    public void printInfo() {
        System.out.println("Employee Name: " + firstName + " " + lastName +
                           "\nYears of Service: " + yearsOfService +
                           "\nSalary: " + salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public double getSalary() {
        return salary;
    }
}
