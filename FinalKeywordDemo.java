// Final class cannot be inherited
final class FinalClass {
    void display() { System.out.println("This is a final class"); }
}

class Parent {
    // Final variable (constant)
    final int MAX_VALUE = 100;
    
    // Final method cannot be overridden
    final void display() { System.out.println("This is a final method"); }
}

class Child extends Parent {
    // Cannot override final method
    // void display() { } // This would cause compilation error
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Final variable value: " + parent.MAX_VALUE);
        parent.display();
        
        // Cannot modify final variable
        // parent.MAX_VALUE = 200; // This would cause compilation error
        
        // Cannot inherit from final class
        // class SubClass extends FinalClass { } // This would cause compilation error
    }
} 