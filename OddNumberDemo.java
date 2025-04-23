class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberDemo {
    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException(number + " is an odd number!");
        }
        System.out.println(number + " is an even number.");
    }
    
    public static void main(String[] args) {
        try {
            checkEvenNumber(4);
            checkEvenNumber(7);
        } catch (OddNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 