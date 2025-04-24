import java.util.*;

class Duplicate extends Exception {
    public Duplicate(String message) {
        super(message);
    }
}

public class DuplicateCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Enter integers (type -1 to stop):");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;

            try {
                if (!numbers.add(num)) {
                    throw new Duplicate("Duplicate number found: " + num);
                }
            } catch (Duplicate e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        sc.close();
        System.out.println("No more input. Program ended.");
    }
}
