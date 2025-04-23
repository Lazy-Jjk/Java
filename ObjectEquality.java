public class ObjectEquality {
    private String name;
    private int age;
    
    public ObjectEquality(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public boolean equals(ObjectEquality obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && 
               name.equals(obj.name) && age == obj.age);
    }
    
    public static void main(String[] args) {
        ObjectEquality obj1 = new ObjectEquality("John", 25);
        ObjectEquality obj2 = new ObjectEquality("John", 25);
        ObjectEquality obj3 = new ObjectEquality("Jane", 30);
        
        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));
        System.out.println("obj1 equals obj3: " + obj1.equals(obj3));
    }
} 