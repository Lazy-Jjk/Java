public class ObjectCloning {
    private int value;
    
    public ObjectCloning(int value) { this.value = value; }
    public ObjectCloning(ObjectCloning obj) { this.value = obj.value; }
    public void setValue(int value) { this.value = value; }
    public int getValue() { return value; }
    
    public static void main(String[] args) {
        ObjectCloning original = new ObjectCloning(10);
        ObjectCloning clone = new ObjectCloning(original);
        
        System.out.println("Original value: " + original.getValue());
        System.out.println("Clone value: " + clone.getValue());
        
        original.setValue(20);
        System.out.println("\nAfter changing original:");
        System.out.println("Original value: " + original.getValue());
        System.out.println("Clone value: " + clone.getValue());
    }
} 