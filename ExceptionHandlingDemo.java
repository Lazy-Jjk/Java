public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // ArithmeticException example
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!\nException: " + e.getMessage());
        }
        
        // ArrayIndexOutOfBoundsException example
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Element at index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!\nException: " + e.getMessage());
        }
        
        // Finally block example
        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes");
        }
    }
} 