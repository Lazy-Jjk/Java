public class ObjectEquality {
    String name; int age;
    ObjectEquality(String name, int age) { this.name = name; this.age = age; }

    boolean equals(ObjectEquality o) {
        return o != null && name.equals(o.name) && age == o.age;
    }

    public static void main(String[] args) {
        ObjectEquality a = new ObjectEquality("John", 25);
        ObjectEquality b = new ObjectEquality("Joh", 25);
        System.out.println("Equal: " + a.equals(b));
    }
}
