public class MethodOverloading {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        
        System.out.println("Adding two integers: " + obj.add(5, 3));
        System.out.println("Adding two doubles: " + obj.add(5.5, 3.2));
        System.out.println("Adding three integers: " + obj.add(5, 3, 2));
    }
} 