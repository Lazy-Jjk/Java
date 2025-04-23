public class Student {
    private String name, course;
    private int rollNo;
    
    public Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }
    
    public void displayDetails() {
        System.out.println("Student Details:\nName: " + name + "\nRoll No: " + rollNo + "\nCourse: " + course);
    }
    
    public static void main(String[] args) {
        new Student("John Doe", 101, "Computer Science").displayDetails();
    }
} 