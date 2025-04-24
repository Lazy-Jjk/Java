import java.util.Scanner;

class NoVowels extends Exception {
    public NoVowels(String message) {
        super(message);
    }
}

public class VowelCheck {
    static void checkVowels(String str) throws NoVowels {
        if (!str.toLowerCase().matches(".*[aeiou].*")) {
            throw new NoVowels("No vowels found in the string.");
        } else {
            System.out.println("String contains vowels.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            checkVowels(input);
        } catch (NoVowels e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
