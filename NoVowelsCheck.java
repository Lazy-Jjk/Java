class NoVowels extends Exception {
    NoVowels(String msg) { super(msg); }
}

public class Novowel {
    public static void main(String[] args) throws NoVowels {
        String s="Rythm";
        if (!s.toLowerCase().matches(".[aeiou]."))
            throw new NoVowels("No vowels found!");
        System.out.println("Vowels present in: " + s);
    }
}