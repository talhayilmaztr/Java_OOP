package Personel;

public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee("Talha", "Yilmaz", 2, 20000);
        e1.printInfo();
        e1.giveRaise(20);
        
        Employee e2 = new Employee("John", "Smith", 10000.0);
        e2.printInfo();
        
        Employee e3 = e1;
        e1 = e2;
       
        Manager m1 = new Manager("Alice", "Brown", 5, 50000, "IT");
        m1.printInfo();
        
        Manager m2 = new Manager("Bob", "White", 30000.0, "HR");
        m2.printInfo();

        // Reference test: Checking the references and hash codes of e1, e2, and e3
        System.out.println(e1.getFirstName());
        System.out.println(e2.getFirstName());
        System.out.println(e3.getFirstName());
        
        // Printing hash codes of the employee objects to verify their references
        System.out.println("e1 hashcode = " + e1.hashCode());
        System.out.println("e2 hashcode = " + e2.hashCode());
        System.out.println("e3 hashcode = " + e3.hashCode());
    }
}
