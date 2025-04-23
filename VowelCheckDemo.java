class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}

public class VowelCheckDemo {
    public static void checkVowels(String str) throws NoVowelsException {
        boolean hasVowel = false;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasVowel = true;
                break;
            }
        }
        
        if (!hasVowel) {
            throw new NoVowelsException("The string '" + str + "' does not contain any vowels!");
        }
        System.out.println("The string '" + str + "' contains vowels.");
    }
    
    public static void main(String[] args) {
        try {
            checkVowels("Hello");
            checkVowels("xyz");
        } catch (NoVowelsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 