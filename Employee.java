public class Employee {
    private String name, jobTitle;
    private double salary;
    
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    
    public void updateSalary(double percentage) {
        salary += salary * percentage / 100;
    }
    
    public void displayInfo() {
        System.out.println("Employee Details:\nName: " + name + "\nJob Title: " + jobTitle + "\nSalary: $" + salary);
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "Software Engineer", 50000);
        emp.displayInfo();
        emp.updateSalary(10);
        System.out.println("\nAfter 10% raise:");
        emp.displayInfo();
    }
} 