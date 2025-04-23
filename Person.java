public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
    
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jane", 30);
        
        System.out.println("Person 1:");
        person1.displayInfo();
        
        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
} 