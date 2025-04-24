public class OddNumberExceptionDemo {
    static void checkEven(int num) throws Exception {
        if (num % 2 != 0)
            throw new Exception("Number is odd!");
        else
            System.out.println("Number is even.");
    }

    public static void main(String[] args) {
        try {
            checkEven(5); // Change to test other numbers
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
