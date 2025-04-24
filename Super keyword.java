class Parent {
    int x = 10;

    void show() {
        System.out.println("Parent method");
    }

    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        super(); // Calls Parent constructor
        System.out.println("Child constructor");
    }

    void display() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x); // Access parent variable
        super.show(); // Call parent method
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}