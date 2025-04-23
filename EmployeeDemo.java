// Abstract class Employee
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    abstract void displayInfo();
}

// Manager class
class Manager extends Employee {
    double baseSalary;
    double bonus;

    Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }

    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager ID: " + id);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Programmer class
class Programmer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Programmer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Programmer ID: " + id);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 50000, 10000);
        Employee programmer = new Programmer("Bob", 202, 1000, 30);

        System.out.println("=== Manager Info ===");
        manager.displayInfo();

        System.out.println("\n=== Programmer Info ===");
        programmer.displayInfo();
    }
}
