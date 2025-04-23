class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class DuplicateNumberDemo {
    public static void checkDuplicates(int[] numbers) throws DuplicateNumberException {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    throw new DuplicateNumberException("Duplicate number found: " + numbers[i]);
                }
            }
        }
        System.out.println("No duplicate numbers found.");
    }
    
    public static void main(String[] args) {
        try {
            int[] numbers1 = {1, 2, 3, 4, 5};
            int[] numbers2 = {1, 2, 2, 3, 4};
            
            System.out.println("Checking first array:");
            checkDuplicates(numbers1);
            
            System.out.println("\nChecking second array:");
            checkDuplicates(numbers2);
        } catch (DuplicateNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 