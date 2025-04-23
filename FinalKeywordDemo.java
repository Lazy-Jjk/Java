
final class FinalClass {
    void display() { System.out.println("This is a final class"); }
}
class Parent {
    final int MAX_VALUE = 100;
    final void display() { System.out.println("This is a final method"); }
}
class Child extends Parent {
}
public class FinalKeywordDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Final variable value: " + parent.MAX_VALUE);
        parent.display();
    }
} 
